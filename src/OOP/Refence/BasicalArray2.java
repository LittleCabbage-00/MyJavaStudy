package OOP.Refence;
class Demo{
    String temp="something";    //此处不封装属性，使其它访问方便
}
public class BasicalArray2 {
    public static void main(String[] args){
        Demo d1=new Demo();     //实例化对象
        d1.temp="open";         //修改对象里面temp属性
        System.out.println("before is: "+d1.temp);
        fun(d1);
        System.out.println("after is: "+d1.temp);
    }
    public static void fun(Demo d2){//此处的方法由主方法直接调用
        d2.temp="new";          //修改属性内容
    }
    //此处结果上，字符串得到了修改
    //但是此处的String是作为一个Demo类的属性存在的，操作时更改的是Demo属性的内容 
}
