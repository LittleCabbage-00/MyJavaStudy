package JavaOftenUseClassPark;

public class StringBufferDemo_0 {

    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("hello");

        //add
        System.out.println("添加：");
        System.out.println(buf+"\n");
        buf.append(" world").append("!!!\n");
        buf.append("boolean == ").append(true);
        System.out.println(buf);

        //insert
        fenge();
        System.out.println("插入：");
        StringBuffer buf_i = new StringBuffer();
        buf_i.append("something");
        System.out.println(buf_i+"\n");
        buf_i.insert(1,"hello");
        buf_i.insert(buf_i.length(),"yield");
        System.out.println(buf_i);

        //reverse
        fenge();
        System.out.println("反转：");
        StringBuffer buf_rv = new StringBuffer();
        buf_rv.append("world");
        System.out.println(buf_rv+"\n");
        buf_rv.reverse().toString();
        System.out.println(buf_rv);

        //replace
        fenge();
        System.out.println("替换：");
        StringBuffer buf_rp = new StringBuffer();
        buf_rp.append("hello world");
        System.out.println(buf_rp+"\n");
        buf_rp.replace(6,11,"IDEA");
        System.out.println(buf_rp);

        //intercept
        fenge();
        System.out.println("截取:");
        StringBuffer buf_itp = new StringBuffer();
        buf_itp.append("hello ").append("world");
        System.out.println(buf_itp+"\n");
        String str= buf_itp.substring(3,7);
        System.out.println(str);

        //delete
        fenge();
        System.out.println("删除：");
        StringBuffer buf_d = new StringBuffer();
        buf_d.append("hello world!!");
        System.out.println(buf_d+"\n");
        buf_d.delete(6,10);
        System.out.println(buf_d);

        //lookup
        fenge();
        System.out.println("查找：");
        StringBuffer buf_lu = new StringBuffer();
        buf_lu.append("hello world!!");
        System.out.println(buf_lu+"\n");
        if (buf_lu.indexOf("hello")==0){
            System.out.println("查找\"hello\"结果：存在");
        }else{
            System.out.println("null");
        }

    }

    public static void fenge(){
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
