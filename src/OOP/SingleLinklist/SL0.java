package OOP.SingleLinklist;
//简单单向链表的设置及输出
class Node{
    private String data;                    //保存节点内容
    private Node next;                      //保存下一个节点
    public Node(String data){               //构造方法设置节点内容
        this.data=data;
    }
    public String getData(){                //getter方法
        return this.data;
    }
    public void setNext(Node next){         //setter方法
        this.next=next;
    }
    public Node getNext(){
        return this.next;
    }
}
public class SL0 {
    public static void main(String[] args){
        Node root=new Node("head");    //定义根节点
        Node n1=new Node("box~A");     //第一个车厢
        Node n2=new Node("box~B");
        Node n3=new Node("box~C");
        root.setNext(n1);                   //定义向后连接的关系
        n1.setNext(n2);
        n2.setNext(n3);
        printNode(root);                    //根节点是输出起点
    }
    public static void printNode(Node node){
        System.out.print(node.getData()+"\t");
        if (node.getNext()!=null){          //判断非空，然后继续输出
            printNode(node.getNext());      //递归调用，迭代输出
        }
    }
}
