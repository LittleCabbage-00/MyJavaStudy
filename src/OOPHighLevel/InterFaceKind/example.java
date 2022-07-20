package OOPHighLevel.InterFaceKind;
interface A01{
    public abstract void print();
}
class B01 implements A01{
    @Override
    public void print() {
        System.out.println("hey");
    }
}
public class example {
    public static void main(String[] args) {
        A01 a=new B01() ;
        a.print();
    }
}
