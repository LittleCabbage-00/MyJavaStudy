package OOP.InsideKind;
public class ExampleLogin {
    public static void main(String[] args){
        if(args.length!=2){             //判断参数个数
            System.out.println("输入的格式不正确，已退出");
            System.out.println("格式：Loginname 用户名 密码");
            System.exit(1);      //系统退出
        }
        String name=args[0];
        String password=args[1];
        if(name.equals("Amy")&&password.equals("1")){
            //验证
            System.out.println("name"+name);
        }else{
            System.out.println("error");
        }
    }
}
//要运行需到桌面，删掉上面package的一排内容
//然后javac -encoding utf-8 ExampleLogin.java来创建.class文件
//然后java ExampleLogin Amy 1运行