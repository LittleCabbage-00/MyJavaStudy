package JavaOftenUseClassPark;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerClass {
    public static void main(String[] args) {
        Timer t = new Timer();
        MyTask myTask = new MyTask();
        t.schedule(myTask,1000,2000);
    }
}
class MyTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("当前时间为： "+sdf.format(new Date()));
    }
}