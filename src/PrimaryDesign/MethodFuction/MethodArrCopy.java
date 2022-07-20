package PrimaryDesign.MethodFuction;

public class MethodArrCopy {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={11,22,33,44,55,66,77,88,99};
        copy(a,1,b,1,5);
        print(b);//s1,复制数组起始点，s2，目标数组起始点，len，复制长度
    }
    public static void copy(int[] s,int s1,int[] o,int s2,int len){
        if (len >= 0) {
            System.arraycopy(s, s1, o, s2, len);
        }
    }
    public static void print(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+"\t");
        }
    }
}
