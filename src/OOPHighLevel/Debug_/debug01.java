package OOPHighLevel.Debug_;

public class debug01 {
    public static void main(String[] args) {
        //逐行调试
        //f7一行一行走
        int res=0;
        for (int i = 0; i < 5; i++) {
            res+=i;
            System.out.println("i= "+i );
            System.out.println("res= "+res);
        }
        System.out.println("out for....");
    }
}
