package JavaOftenUseClassPark.RuntimeClass;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) throws IOException {
        String str=null;
        String x="wewe";

        Runtime run=Runtime.getRuntime();
        System.out.println(run);
        //System.out.println(run.exec("winver"));
        System.out.println(run.freeMemory());
        System.out.println(run.maxMemory());
        for (int i = 0; i < 100; i++) {
            str+=x;
        }

        System.out.println(run.freeMemory());
        run.gc();
        System.out.println(run.freeMemory());
    }
}
