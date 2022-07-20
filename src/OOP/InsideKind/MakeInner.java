package OOP.InsideKind;
//定义内部类
//内部类唯一好处就是可以方便的访问外部类中的私有属性
class Outer{                            //定义外部类
    private String info="something";    //外部类的私有属性
    class Inner{                        //定义内部类
        public void print(){            //内部类的方法
            System.out.println(info);   //直接访问外部类私有属性
        }
    }
    public void fun(){                  //定义方法
        new Inner().print();            //通过内部类对象调用方法
    }
}
public class MakeInner {
    public static void main(String[] args){
        new Outer().fun();              //调用外部类fun()方法
    }
}
