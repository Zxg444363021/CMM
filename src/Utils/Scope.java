package Utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZXG on 2016/12/20.
 * 存放变量的M作用域，主键为变量名，Item存放变量的类型和数值，均以String形式存放。
 */
public class Scope {
    private Scope parent=null;
    private class Item{
        private int type;
        private String value=null;
        private int length=-1;
        private int[] intArr;
        private double[] doubleArr;
        private Item(int type,String value){
            this.type=type;
            this.value=value;
        }
        private Item(int type){
            this.type=type;
        }
        private Item(int type,int length){
            this.type=type;
            if(type==Macro.INTARR)
                intArr=new int[length];
            else if(type==Macro.DOUBLEARR)
                doubleArr=new double[length];
            this.length=length;
        }
        public int getLength(){
            return length;
        }
        //判断item是不是一个数组
        private boolean isArr(){
            return length>=0?true:false;
        }
    }
    private Map<String,Item> map;
    //构造函数有父作用域
    public Scope(Scope parent){
        if(parent!=null) {
            this.parent = parent;
            map=new HashMap<String,Item>();
        }
    }
    //构造函数没有父作用域
    public Scope(){
        map=new HashMap<String,Item>();
    }
    //作用域是否有父作用域
    public boolean hasParent(){
        return parent==null?false:true;
    }
    //设置副作用域
    public void setParent(Scope parent){
        this.parent=parent;
    }
    public Scope getParent(){
        if(parent!=null)
            return parent;
        else
            return null;
    }
    //查找是否声明了该变量
    public boolean contain(String name){
        //在当前作用域中查找
        if(map.containsKey(name)){
            return true;
        }else {//如果当前作用域中没有该变量，则再其父作用域中找。
            if(!hasParent()){//如果没有父作用域，则说明未声明该变量。
                return false;
            }else{
                return getParent().contain(name);
            }
        }
    }
    //以变量名为键值获取变量值
    public String getValue(String name){
        if(!contain(name))
            return null;
        else{
            if(map.containsKey(name)){
                return map.get(name).value;
            }
            else{
                return getParent().getValue(name);
            }
        }
    }
    //以变量名获取item
    public Item getItem(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }else{
            if(hasParent()){
                return getParent().getItem(name);
            }
            else
                return null;
        }
    }
    //获取数组元素的值
    public String getElementValue(String name,int index){
        Item item=getItem(name);
        if(!contain(name)){
            return null;
        }else if(contain(name)&&!item.isArr()){//如果包含变量但是不是数组
            return null;
        }else{
            if(item.type==Macro.INTARR){
                return String.valueOf(item.intArr[index]);
            }else{
                return String.valueOf(item.doubleArr[index]);
            }
        }
    }
    //设置变量值
    public boolean setValue(String name,String value){
        if(!contain(name))
            return false;
        else{
            if(map.containsKey(name)){
                    map.get(name).value=value;
                return true;
            }else{
                if(hasParent()){
                    getParent().setValue(name,value);
                    return true;
                }
                else
                    return false;
            }
        }
    }
    //设置数组元素的值
    public boolean setValue(String name,int index,String value){
        Item item=getItem(name);
        if(item!=null){
            if(index<0||index>item.length){
                return false;//越界
            }else{
                if(item.type==Macro.INTARR){
                    item.intArr[index]=Integer.valueOf(value);
                    return true;
                }else if(item.type==Macro.DOUBLEARR){
                    item.doubleArr[index]=Double.valueOf(value);
                    return true;
                }else
                    return false;
            }
        }else
            return false;

    }
    //获取类型
    public int getType(String name){
        if(map.containsKey(name)){
            return map.get(name).type;
        }
        else{
            if(hasParent()){
                return getParent().getType(name);
            }
            else
                return -1;

        }
    }
    //添加变量
    public void put(String name,int type,String value){
        map.put(name,new Item(type,value));
    }
    public void put(String name,int type,int length){map.put(name,new Item(type,length));}
    public void put(String name,int type){map.put(name,new Item(type));}

    //输出变量
    public void printVar(String name){
        if(contain(name)){
            System.out.println("Type:"+this.getType(name)+",Name:"+name+",Value:"+this.getValue(name));
        }
    }
    public boolean containVar(String name){
        if(map.containsKey(name))
            return true;
        else return false;
    }
    //获取数组长度
    public int getItemLength(String name){
        return getItem(name).getLength();
    }


}
