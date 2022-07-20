package JavaIOClass.SystemClass;
//System.err错误信息输出 err
public class ErrDemo_0 {
    public static void main(String[] args) {
        String str = "something" ;
        try{
            System.out.println(Integer.parseInt(str)) ;
        }catch(Exception e){
            e.printStackTrace();
            System.err.println(e) ;
        }
    }
}
