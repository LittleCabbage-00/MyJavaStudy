package PrimaryDesign.BasalStudy;

public class ContinueAndBreak {
    public static void main(String[] args){
        int t=0,i=0;
        while(true){
            t++;
            if(t==1){
                System.out.println(1);
                continue;
            }
            else if(i==2){
                System.out.println(2);
                continue;
            }

            System.out.println(0);
            break;
        }
    }
}
