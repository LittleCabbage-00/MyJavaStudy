package Threads_.Thread_Operation;
//线程的生命周期,大概这个程序是死循环，需要删除那个检测线程活跃的sout
class MyThread05 implements Runnable{
    private boolean flag=true;

    @Override
    public void run() {
        int i=0;
        int j=0;
        while (this.flag){
            while (true) {
                j++;
               if (j==10){
                   this.flag=false;
               }
                System.out.println(Thread.currentThread().getName()
                        +"运行,i = "+(i++));
            }
        }
    }
    public void stop(){
        this.flag=false;
    }
}
public class Thread_Life {
    public static void main(String[] args) {
        MyThread05 mt5 = new MyThread05();
        Thread t5 = new Thread(mt5, "线程");
        t5.start();
        //System.out.println(Thread.currentThread().isAlive());
        mt5.stop();
        System.out.println(Thread.currentThread().isAlive());
    }
}
