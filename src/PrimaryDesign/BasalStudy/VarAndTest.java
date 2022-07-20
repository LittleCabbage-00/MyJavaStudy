package PrimaryDesign.BasalStudy;

import java.util.Random;

public class VarAndTest {
    public static void main(String[] args){
        Random rand = new Random(100L);
        float[] f = new float[10];

        for(int i = 0; i < 10; ++i) {
            f[i] = rand.nextFloat();
        }

        int var4 = f.length;

        int var5;
        for(var5 = 0; var5 < var4; ++var5) {
            float x = f[var5];
            System.out.println(x);
        }

        char[] var8 = "rnm tuiqian".toCharArray();
        var4 = var8.length;

        for(var5 = 0; var5 < var4; ++var5) {
            char c = var8[var5];
            System.out.print(c + " ");
        }

        System.out.println();
    }
}
