package Threads_;
//共享线程
class MyThread02 implements Runnable{
    private int ticket=5;
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(ticket>0){
            System.out.println("卖票：ticket = "+ticket--);
            }
        }
    }
}
public class Runnable_Share {
    public static void main(String[] args) {
        MyThread02 my = new MyThread02();
        new Thread(my).start();
        new Thread(my).start();
        new Thread(my).start();
    }
}
