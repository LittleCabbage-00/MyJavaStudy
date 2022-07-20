package Threads_;
//线程中断
class MyThread07 implements Runnable{
    @Override
    public void run() {
        System.out.println("1、进入run方法");
        try {
            Thread.sleep(1000);
            System.out.println("2、已完成休眠");
        }catch (Exception e){
            System.out.println("3、休眠终止");
            return;
        }
        System.out.println("4、run方法正常结束");
    }
}
public class Thread_interrupt {
    public static void main(String[] args) {
        MyThread07 mt7 = new MyThread07();
        Thread t7 =   new Thread(mt7, "线程");
        t7.start();
        try {
            Thread.sleep(500);
        }catch (Exception e){ }
        t7.interrupt();
        System.out.println(t7.isInterrupted());
    }
}
