package PrimaryDesign.MethodFuction;

public class MethodNo {
    public static void main(String[] args) {
        PrintInfo();
    }
    public static void PrintInfo(){
        char[] c = {'H','e',' ','i','s',' ','a',' ','p','r','i','a','t','e','r'};
        for (char value : c) {      //for(int i=0;i<c.length;i++){
            System.out.print(value);//System.out.print(c[i]);
        }
        System.out.println("");
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
    }
}
