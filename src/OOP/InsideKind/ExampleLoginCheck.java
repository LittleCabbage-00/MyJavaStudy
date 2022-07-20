package OOP.InsideKind;
//修改上一个程序，将信息的判断过程形成若干类
class Check{
    public boolean validate(String name,String password){   //验证操作
        if(name.equals("Amy")&&password.equals("1")){
            return true;                                    //正确就返回true
        }else {
            return false;                                   //错误就返回false
        }
    }
}
class Operate{                                              //本类只是调用具体的验证操作
    private String info[];                                  //定义一个数组属性，用于接收全部输入参数
    public Operate(String info[]){                          //通过构造方法取得全部的输入参数
        this.info=info;
    }
    public String login(){
        Check check=new Check();
        this.isExit();
        String name=this.info[0];                           //取出用户名
        String password=this.info[1];                       //取出密码
        String str=null;
        if (check.validate(name,password)){                 //登录验证
            str="hello "+name+" come";
        }else {
            str="error username and password";
        }
        return str;                                         //返回信息给用户
    }
    public void isExit(){
        if (this.info.length!=2){                           //判断参数个数
            System.out.println("input error,system out");
            System.out.println("you should input like:");
            System.out.println("username password");
            System.exit(1);
        }
    }
}
public class ExampleLoginCheck {
    public static void main(String[] args){
        Operate oper=new Operate(args);                     //实例化操作类对象
        System.out.println(oper.login());                   //取得验证信息
    }
}
//主方法处代码较少，因为是客户端，所以要方便客户使用
//Check类的主要功能就是验证操作，只需要传入用户名和密码即可完成验证
//Operate类的主要功能就是封装Check类的操作,并把Check的信息返回给调用处