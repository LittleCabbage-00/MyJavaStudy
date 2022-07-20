package OOPHighLevel.InterFaceKind;

abstract class A02{
    public abstract void printA();
    interface B02{
        public void printB();
    }
}
class C02 extends A02{
    @Override
    public void printA() {
        System.out.println("hello A");
    }
    class D02 implements B02{
        @Override
        public void printB() {
            System.out.println("hello B");
        }
    }
}
public class wide {
    public static void main(String[] args) {
        A02.B02 b=new C02().new D02();
        b.printB();
    }
}
