package PrimaryDesign.AfterWorks;

public class work4_1 {          //1到30的阶乘和
    public static void main(String[] args) {
        System.out.println("result is: "+sum());
    }
    public static double sum()
    {
        int i,j;
        double sum=0,k;
        for(i=1;i<=30;i++)
        {
            k=1;
            for(j=1;j<=i;j++)
            {
                k*=j;
            }
            sum+=k;
            System.out.println("the "+i+" time: "+k);
        }
        return sum;
    }
}
