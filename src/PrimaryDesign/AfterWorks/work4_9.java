package PrimaryDesign.AfterWorks;

public class work4_9 {      //获得数组最大值然后将其放在首位，其他数字位置不变
    public static void main(String[] args){
        int[] score={12,6,98,38,24,65,54,18};
        int max=0,i,temp,io=0;
        for (i=0;i<score.length;i++) {
            if (score[i] > max) {
                max = score[i];
                io=i;
            }
        }
        temp=score[0];
        score[0]=max;
        score[io]=temp;
        for (int k : score) {
            System.out.print(k + " ");
        }
    }
}
