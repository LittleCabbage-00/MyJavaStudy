package OOP.InsideKind;
//使用static定义内部类
//有static的话，直接用Outter0.innerinner().out()调用
//没有static的话，需要用方法把out先new出来之后才能调用
//()是看class下面调用的有没有public的方法，有就()，没有就不加
class Outer0{
    private static String info="something new";
    static class Inner0{                //使用static定义内部类为外部类
        public void printout(){
            System.out.println(info);
        }
    }
    class innnerinner{
        public void out(){
            System.out.println("test");
        }
    }
    public void out(){
        new innnerinner().out();
    }
}
public class StaticInner {
    public static void main(String[] args){
        new Outer0.Inner0().printout();//访问内部类
        new Outer0().out();
    }
}
