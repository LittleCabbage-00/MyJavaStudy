package JavaOftenUseClassPark;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] temp={3,8,5,7,4,9,1,6,2};

        Arrays.sort(temp);
        System.out.print("排序之后的数组："+Arrays.toString(temp)+"\n");

        int point = Arrays.binarySearch(temp,3);
        System.out.println("排序之后，3的位置是："+point);

        Arrays.fill(temp,4);
        System.out.println("用4填充数组："+Arrays.toString(temp));
    }
}
