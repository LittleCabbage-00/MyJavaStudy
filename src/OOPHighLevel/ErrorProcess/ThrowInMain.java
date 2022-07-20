package OOPHighLevel.ErrorProcess;

class Math01{
    public int div(int i,int j){
        int temp=i/j;
        return temp;
    }
}

public class ThrowInMain {
    public static void main(String[] args) throws Exception{
        //此程序在主方法处使用了throws，因此就不用try catch进行异常捕获和处理了
        Math01 math = new Math01();
        System.out.println("除法结果是："+math.div(10,0));
    }
}
