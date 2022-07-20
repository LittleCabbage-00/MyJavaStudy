package OOP.Refence;
//接受本类的引用
class Demo0{
    private int temp=30;        //声明temp属性并封装
    public void fun(Demo0 d2){  //接受本类的引用
        d2.temp=50;             //直接通过对象调用本类的私有属性
    }
    public int getTemp(){       //getter方法
        return temp;
    }
    public void setTemp(int t){ //setter方法
        temp=t;
    }
}
public class GetTxtRefence {
    public static void main(String[] args){
        Demo0 d1=new Demo0();   //实例化Demo0对象
        d1.setTemp(50);         //修改temp内容
        d1.fun(d1);             //把Demo0的对象传回自己的类中
        System.out.println("temp = "+d1.getTemp());
    }
}
//这是在类的内部，因此可以访问其中的私有属性，只要符合引用传递的语法
//就能向任意地方传递
