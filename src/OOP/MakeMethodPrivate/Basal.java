package OOP.MakeMethodPrivate;
/*class DemoB{
    private DemoB(){

    }
    public void print(){
        System.out.println("private,fuck you");
    }
}
public class Basal {
    public static void main(String[] args){
        DemoB p1=new DemoB();//无法实例化这个被封装的构造
        p1.print();
    }
}*/
class DemoB{
    static DemoB instance=new DemoB();
    //在内部产生本类的实例化对象
    private DemoB(){

    }
    public void print(){
        System.out.println("private,fuck you");
    }
}
public class Basal {
    public static void main(String[] args){
        DemoB p1=null;
        p1=DemoB.instance;
        p1.print();
    }
}
