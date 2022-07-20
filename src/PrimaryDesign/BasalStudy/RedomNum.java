package PrimaryDesign.BasalStudy;

import java.util.Random;

public class RedomNum {
    public static void main(String[] args){
        int h = 0;
        int i = 0;

        for(int g = 1; g <= 10; ++g) {
            System.out.println("第" + g + "次");
            Random rand = new Random();
            int e = rand.nextInt(100);
            int f = rand.nextInt(100);
            System.out.println(e + " " + f);
            if (e > f) {
                System.out.println("1");
                ++h;
            } else {
                System.out.println("0");
                ++i;
            }
        }

        System.out.print(h + " " + i);
    }
}
