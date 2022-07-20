package PrimaryDesign.AfterWorks;

public class work4_4 {              //统计数组的和以及它的最大值和最小值
     public static void main(String[] args){
        int[] sc={8,9,5,65,6,7,8,9,10};
        int max=sc[0],min=sc[0];
        int temp=0;
        for (int j : sc) {
            temp += j;
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println("sum is :"+temp);
        System.out.println("max is : "+max+"\nmin is : "+min);
    }
}
