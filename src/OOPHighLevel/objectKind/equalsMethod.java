package OOPHighLevel.objectKind;

public class equalsMethod {
    public static void main(String[] args) {
        A a = new A();
        A b=a;
        A c=b;
        System.out.println(a==c);
        B bobj=a;
        System.out.println(bobj==b);
        int num1=10;
        double num2=10.0;
        System.out.println(num1==num2);
        System.out.println("hello".equals("abc"));
    }
}
class A extends B{

}
class B{

}
