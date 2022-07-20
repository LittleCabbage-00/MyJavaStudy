package Threads_;
//线程的休眠
class MyThread06 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"运行 --> "+i);
            }catch (Exception e){}
        }
    }
}
public class Thread_Sleep {
    public static void main(String[] args) {
        MyThread06 mt6 = new MyThread06();
        new Thread(mt6,"线程").start();
    }
}
