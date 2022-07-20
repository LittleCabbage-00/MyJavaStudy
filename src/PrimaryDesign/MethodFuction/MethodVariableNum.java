package PrimaryDesign.MethodFuction;

public class MethodVariableNum {
    public static void main(String[] args){
        System.out.print("No number: ");
        fun();
        System.out.print("\ntrans 1 number: ");
        fun(1);
        System.out.print("\ntrans 5 numbers :");
        fun(1,2,3,4,5);
    }
    public static void fun(int... arg){
        for(int i=0;i<arg.length;i++){
            System.out.print(arg[i]+" ");
        }
    }
}
