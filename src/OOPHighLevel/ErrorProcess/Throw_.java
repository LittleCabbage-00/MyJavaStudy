package OOPHighLevel.ErrorProcess;
class Math{
    public int div(int i,int j) throws Exception{
        int temp=i/j;
        return temp;
    }
}
public class Throw_ {
    public static void main(String[] args) {
        Math m=new Math();
        try {       //因为有throws，不管有没有异常都要进行处理
            System.out.println("除法："+m.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("发生了错误");
    }
}