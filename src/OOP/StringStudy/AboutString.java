package OOP.StringStudy;

public class AboutString {
    public static void main(String[] args){
        String str="vav";
        String str1=new String("fewg");
        System.out.println(str);
        System.out.println(str1);
    }
}
//切记切记，包的名字不能和java.lang里面已有名字重复
//在起类名时，不要使用jdk中已经存在的类，尤其是java.lang包下存在的类名。
//也就是不能起String，Int，Object，Process这些包名