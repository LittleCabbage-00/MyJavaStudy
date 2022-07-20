package PrimaryDesign.MethodFuction;

public class MethodArrSort {
    public static void main(String[] args){
        int[] score={12,58,9,6,25,36,98,78,54};
        int[] sc={78,85,45,58,59,25,67,21,24,37,61};
        //sort(score);
        java.util.Arrays.sort(score);
        print(score);
        fenge();
        sort(sc);
        print(sc);
    }
    public static void fenge(){
        System.out.println("");
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
    public static void sort(int[] temp){
        for(int i=0;i<temp.length;i++){
            for (int j=0;j<temp.length;j++){
                if(temp[i]<temp[j]){
                    int x=temp[i];
                    temp[i]=temp[j];
                    temp[j]=x;
                }
            }
        }
    }
    public static void print(int[] temp){
        for (int j : temp) {
            System.out.print(j + "\t");
        }
    }
}
