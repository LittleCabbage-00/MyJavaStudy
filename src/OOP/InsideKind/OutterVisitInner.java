package OOP.InsideKind;
//在外部访问内部类
class Outter1 {                       //定义外部类
    private String info="something new";
    class Inner1{                    //定义内部类
        public void print(){
            System.out.println(info);//访问外部类的私有属性
        }
    }
    ///////////////
    class iner{
        public void out(){
            System.out.println("new test");
        }
    }
}
public class OutterVisitInner {
    public static void main(String[] args){
        Outter1 out=new Outter1();    //实例化外部类对象
        Outter1.Inner1 in=out.new Inner1();
        //实例化内部类对象
        in.print();                  //调用内部类方法
        //////////////
        Outter1 inr=new Outter1();
        Outter1.iner inn=inr.new iner();
        inn.out();
    }
}