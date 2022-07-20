package JavaOftenUseClassPark.SystemClass;
//列出特定属性

public class SystemDemo_2 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name")+" "+System.getProperty("os.version")+" "+System.getProperty("os.arch"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
    }
}
