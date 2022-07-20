package PrimaryDesign.AfterWorks;

public class work4_10<b> {      //向一维数组指定位置插入数字
    public static void main(String[] args){
        int[] score={45,88,97,54,36,54,95,46,76,31};
        int[] sc={1,45,896,5,2,36};
        add(score,12,6);
        add(sc,54,3);
    }
    public static void add(int[] a,int num, int pos){
        int[] newArray=new int[a.length+1];
        for(int i=0;i<a.length;i++){
            newArray[i]=a[i];
        }
        for (int i = newArray.length - 1; i > pos; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[pos] = num;
        a = newArray;
        //Arrays.toString(a);
        for(int j:a){
            System.out.print(j+" ");
        }
        System.out.println("");
    }
}

