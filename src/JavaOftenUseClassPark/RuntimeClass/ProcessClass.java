package JavaOftenUseClassPark.RuntimeClass;

public class ProcessClass {
    public static void main(String[] args) {
        Runtime running=Runtime.getRuntime();

        Process pro=null;

        try {
            pro=running.exec("notepad.exe");
        }catch (Exception e){
            System.out.println("error");
        }

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("error");
        }
        pro.destroy();
    }
}
