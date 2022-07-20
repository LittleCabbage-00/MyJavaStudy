package OOPHighLevel.ErrorProcess;

class Math02{
    public int div(int i,int j) throws Exception{
        System.out.println("start....");
        int temp=0;
        try {
            temp=i/j;
        }catch (Exception e){
            throw e;
        }finally {
            System.out.println("end....");
        }
        return temp;
    }
}

public class Example {
    public static void main(String[] args) {
        Math02 math02 = new Math02();
        try {
            System.out.println("div operation: "+math02.div(10,0));
        }catch (Exception e){
            System.out.println("error is made: "+e);
        }
    }
}
