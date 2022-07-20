package PrimaryDesign.MethodFuction;

public class MethodDelivery {
    public static void main(String[] args){
        (new MethodDelivery()).method0();
        (new MethodDelivery()).method1();
    }

    private void method0() {
        int[] temp = {1, 2, 4, 5, 6};
        int sum = 0;
        fun(temp);
        for (int j : temp) {
            System.out.print(j + " ");
            sum = j + sum;
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("\n" + sum);
    }

    public static void fun(int[] x){
        x[4]=8;
    }
////////////////////////////////////////////////
    private void method1(){
        int[] temp =f();
        print(temp);
    }
    public static void print(int[] x){
        for (int j : x) {
            System.out.print(j + " ");
        }
    }
    public static int[] f(){
        return new int[]{1, 3, 5, 7, 9};
    }
}
