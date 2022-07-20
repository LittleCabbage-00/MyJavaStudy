package OOPHighLevel.ErrorProcess;

public class ThrowSelf {
    public static void main(String[] args) {
        try {
            throw new Exception("自己的异常");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
