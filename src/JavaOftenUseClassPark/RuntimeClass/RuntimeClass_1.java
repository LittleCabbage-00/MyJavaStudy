package JavaOftenUseClassPark.RuntimeClass;

public class RuntimeClass_1 {
    public static void main(String[] args) {
        Runtime ran=Runtime.getRuntime();
        try {
            ran.exec("notepad.exe");
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
