package OOPHighLevel.Debug_;

import java.util.Arrays;

//动态下断点
public class debug04 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        //看Arrays.sort的方法底层实现
        Arrays.sort(arr);
        //alt+shift+f7
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
        System.out.println("hello800");
    }
}
