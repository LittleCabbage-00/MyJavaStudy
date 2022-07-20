package PrimaryDesign.AfterWorks;
import java.util.Random;

public class work4_8 {          //统计30个0到9随机数里面，0到9分别出现的次数
    public static void main(String[] args)
    {
        int[] number =new int[30];
        int[] numbercount =new int[10];
        for(int i=0;i<30;i++)
        {
            number[i]=new Random().nextInt(10);
        }
        for(int i:number)
        {
            numbercount[i]++;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(i+"的次数为："+numbercount[i]);
        }
    }
}

