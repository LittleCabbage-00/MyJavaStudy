package PrimaryDesign.BasalStudy;

import java.util.Scanner;

public class Exchange2Num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n请输入两个整数：");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println("n is "+n+" m is "+m);
        int o=n;
        n=m;
        m=o;
        System.out.print("n is "+n+" m is "+m);
    }
}
