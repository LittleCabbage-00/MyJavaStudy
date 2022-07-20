package OOPHighLevel.Debug_;

import java.util.Arrays;

public class debug03 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 10, -20, 100};
        //看Arrays.sort的方法底层实现
        Arrays.sort(arr);
        //alt+shift+f7
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
