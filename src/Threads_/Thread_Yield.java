package Threads_;
//线程的礼让，将一个线程的操作暂时给给其他线程执行
class MyThread10 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"运行 --> "+i);
            if (i==3){
                System.out.print("开始线程礼让：");
                Thread.yield();
            }
        }
    }
}
public class Thread_Yield {
    public static void main(String[] args) {
        MyThread10 mt10 = new MyThread10();
        Thread t1 = new Thread(mt10, "线程A");
        Thread t2 = new Thread(mt10, "线程B");
        t1.start();
        t2.start();
    }
}
