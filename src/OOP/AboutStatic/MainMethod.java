package OOP.AboutStatic;

public class MainMethod {
    public static void main(String args[]){
         if(args.length!=3){
             System.out.println("get out");
             System.exit(1);
         }
         for (int x=0;x<args.length;x++){
             System.out.println("第"+(x+1)+"个参数： "+args[x]);
        }
    }
}
