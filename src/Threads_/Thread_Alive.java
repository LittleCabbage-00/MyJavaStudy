package Threads_;
//判断线程是否活着
class MyThread04 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"运行 --> "+i);
        }
    }
}
public class Thread_Alive {
    public static void main(String[] args) {
        MyThread04 mt4 = new MyThread04();
        Thread t=new Thread(mt4,"线程");
        System.out.println("线程开始执行之前 --> "+t.isAlive());
        t.start();
        System.out.println("线程开始执行之后 --> "+t.isAlive());
        for (int i = 0; i < 3; i++) {
            System.out.println("main运行 --> "+i);
        }
        System.out.println("线程开始执行之后 --> "+t.isAlive());
    }
}
