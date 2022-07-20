package PrimaryDesign.AfterWorks;

public class NarcissisticNum {//水仙花数
        public static void main(String[] args){
            System.out.println("水仙花数: ");
            for (int a=100;a<1000;a++){
                int b=a/100;//百位数字
                int c=(a-b*100)/10;//十位数字
                int d=(a-b*100-c*10);//个位数字
                if(a==b*b*b+c*c*c+d*d*d){
                    System.out.print(a+" ");
                }
            }
        }
}
