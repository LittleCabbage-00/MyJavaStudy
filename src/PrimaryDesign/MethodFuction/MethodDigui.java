package PrimaryDesign.MethodFuction;

public class MethodDigui {
    public static void main(String[] args){
        System.out.println("result is: "+sum(100));
    }
    public static int sum(int x){
        if(x==1){
            return 1;
        }
        else{
            return x+sum(x-1);
        }
    }
}
