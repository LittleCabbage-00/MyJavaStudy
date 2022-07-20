package Threads_;
//auto setting the name
class MyThread03 implements Runnable{
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"运行，i = "+i);
        }
    }
}
public class Thread_Name {
    public static void main(String[] args) {
        MyThread03 thread03 = new MyThread03();
        //系统自动设置线程名称
        new Thread(thread03).start();
        //手工设置线程名称
        new Thread(thread03,"线程-A").start();
        new Thread(thread03,"线程-B").start();
        new Thread(thread03).start();
        new Thread(thread03).start();
    }
}
