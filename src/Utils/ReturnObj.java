package Utils;

/**
 * Created by ZXG on 2016/12/20.
 * 返回类型的封装，所有的visit函数都返回这样的一个对象。
 */
public class ReturnObj {
    private int type;  //返回的类型
    private String value=null;  //返回值
    private int length;  //返回的有可能是个数组，这是它的长度
    private int line;    //token的行号
    private int index;          //数组元素的下标
    private String name;        //变量名
    public ReturnObj(){}
    public ReturnObj(int type,String value){
        this.type=type;
        this.value=value;
    }
    public void setType(int type){this.type=type;}
    public int getType(){
        return type;
    }
    public void setValue(String value){this.value=value;}
    public String getValue(){
        return value;
    }
    public void setLength(int length){this.length=length;}
    public int getLength(){return length;}
    public void setLine(int line){this.line=line;}
    public int  getLine(){return line;}
    public void setIndex(int index){this.index=index;}
    public int getIndex(){return index;}
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
}
