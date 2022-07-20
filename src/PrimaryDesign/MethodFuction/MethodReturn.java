package PrimaryDesign.MethodFuction;

public class MethodReturn {
    public static void main(String[] args){
        System.out.println("before method");
        method0(10);
        System.out.println("after method");
    }
    public static void method0(int x){
        System.out.println("in the method");
        if(x==10) {
            return;
        }
        System.out.println("inout");
    }
}
