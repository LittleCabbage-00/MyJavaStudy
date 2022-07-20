package OOP.StringStudy;

public class StringCompare {
    public static void main(String[] args){
        int x=1;
        int y=1;
        System.out.println(x==y);
        ///////////////////////
        fenge();
        String str0="hello";
        String str1="hello";                    //直接赋值
        String str2=new String("hello");//因为new关键字，会再开辟一个内存空间用来存放hello
        System.out.println(str0==str1);
        System.out.println(str1==str2);
        ////////////////////////
        fenge();
        System.out.println(str0.equals(str1));
        System.out.println(str1.equals(str2));
        ////////////////////////
        fenge();
        System.out.println("\"hello\"equals\"hello\"-->"+("hello".equals("hello")));
    }
    public static void fenge(){
        for(int i=0;i<20;i++){
            System.out.print("-");
        }
        System.out.println("");
    }
}
