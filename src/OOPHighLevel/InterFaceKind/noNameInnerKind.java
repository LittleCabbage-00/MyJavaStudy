package OOPHighLevel.InterFaceKind;
interface A1{
    public void printInfo();
}
class X1{
    public void fun1(){
        this.fun2(new A1(){
            public void printInfo(){
                System.out.println("something new ");
            }
        });
    }
    public void fun2(A1 a){
        a.printInfo();
    }
}
public class noNameInnerKind {
    public static void main(String[] args) {
        new X1().fun1();
    }
}
