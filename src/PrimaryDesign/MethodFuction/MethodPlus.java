package PrimaryDesign.MethodFuction;

public class MethodPlus {       //Add的三次重载
    public static void main(String[] args){
        int one = Add(10,20);
        float two = Add(10.3f,13.3f);
        int three=Add(10,20,30);
        System.out.println("AddOne's result is: "+one);
        System.out.println("AddTwo's result is: "+two);
        System.out.println("Add's result is: "+three);
    }
    public static int Add(int x,int y){
        int temp;
        temp=x+y;
        return temp;
    }
    public static float Add(float x,float y){
        float temp;
        temp=x+y;
        return temp;
    }
    public static int Add(int x,int y,int z){
        int temp;
        temp=x+y+z;
        return temp;
    }

}
