package OOP.Refence;
//引用传递 基础
class demoA{
    int temp =20;           //先定义了一个值
}
public class Basical {
    public static void main(String[] args){
        demoA d1=new demoA();
        d1.temp=50;         //此处对之前定义的值进行了修改
        System.out.println("before is :"+d1.temp);
        fun(d1);            //d1指向下面d2指向的地址
        System.out.println("after is :"+d1.temp);
    }
    public static void fun(demoA d2){
        d2.temp=100;        //定义d2指向其他地址
    }
}
