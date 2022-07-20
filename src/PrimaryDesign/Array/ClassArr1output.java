package PrimaryDesign.Array;

public class ClassArr1output {
    public static void main(String[] args){
        int[] score =null;
        score =new int[2];
        System.out.println();
        for (int x=0;x<2;x++){
            score[x]=x;
            System.out.println("score["+x+"] = "+score[x]);
        }
        System.out.println("数组长度为"+score.length);
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println("");
        int[] arr ={12,56,58,96,32,32};//==int arr[]={xx,xxx,xxx}
        for(int y=0;y<arr.length;y++){
            System.out.println("arr["+y+"] = "+arr[y]);
        }
    }
}
