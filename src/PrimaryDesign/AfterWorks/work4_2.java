package PrimaryDesign.AfterWorks;

public class work4_2 {      //统计数组里面奇书偶数的个数
    public static void main(String[] args){
        int i=0,k=0;
        int[] score={21,23,5,96,54,5,6};
        for(int j=0;j<score.length;j++){
            if(score[j]%2==0){
                i++;
            }
            else{
                k++;
            }
        }
        System.out.println("偶数为"+i+"个\n"+"奇数为"+k+"个");
    }
}
