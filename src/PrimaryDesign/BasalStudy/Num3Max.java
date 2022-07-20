package PrimaryDesign.BasalStudy;

import java.util.Scanner;

public class Num3Max {
    public static void main(String[] args){
        System.out.println("\n输入三个数字：");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int o=scanner.nextInt();
        int temp = Math.max(n, m);
        int max = Math.max(temp, o);
        System.out.print("max is ");
        System.out.println(max);
    }
}
