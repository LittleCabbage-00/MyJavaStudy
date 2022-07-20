package OOP.SingleLinklist;
//复杂一点的单向链表，可实现增加数据，查找数据，删除数据
class Link{
    class Node{                                     //把节点定义成内部类
        private String data;
        private Node next;
        public Node(String data){
            this.data=data;
        }
        public void add(Node newNode){              //增加add操作
            if(this.next==null){                    //判断下一个节点是否为空
                this.next=newNode;                  //如果为空，则把newNode设置在next位置上
            }else{                                  //如果非空，则存在下一个节点
                this.next.add(newNode);             //在下一个位置处增加，放newNode
            }
        }
        public void print(){
            System.out.print(this.data+"\t");
            if (this.next!=null){                   //如果下一个节点不为空，则继续打印
                this.next.print();                  //输出下一个节点
            }
        }
        public boolean search(String data){         //内部定义搜索方法
            if (data.equals(this.data)){            //判断当前阶段的名字是否与查找的一致
                return true;
            }else {                                 //继续判断下一个
                if (this.next!=null){               //下一个节点存在，则继续查找
                    return this.next.search(data);
                }else {
                    return false;                   //节点不存在，返回false
                }
            }
        }
        public void delete(Node previous,String data){ //删除节点
            if(data.equals(this.data)){             //找到了匹配节点
                previous.next=this.next;            //空出当前节点
            }else{
                if(this.next!=null){
                    this.next.delete(this,data); //继续向下找
                }
            }
        }
    }
    private Node root;                               //表示根节点
    public void addNode(String data){                //增加节点的方法
        Node newNode=new Node(data);                 //建立一个新节点
        if(this.root==null){
            this.root=newNode;                       //如果没有根节点，就把第一个节点设置为根节点
        }else{
            this.root.add(newNode);                  //添加到合适位置
        }
    }
    public void printNode(){                         //打印全部节点
        if (this.root!=null){                        //判断根节点是否存在
            this.root.print();
        }
    }
    public boolean contains(String name){            //判断元素是否存在
        return this.root.search(name);               //调用Node类里面的search()方法
    }
    public void deletNode(String data){              //删除节点
        if (this.contains(data)){                    //如果节点存在，就执行删除操作
            if (this.root.data.equals(data)){        //判断根节点是否满足要求
                this.root=this.root.next;            //将根节点之后的内容设置成根节点
            }else {
                this.root.next.delete(root,data);     //删除根节点
            }
        }
    }
}
public class SL1 {
    public static void main(String[] args){
        Link l=new Link();
        l.addNode("A");                         //增加根节点
        l.addNode("B");
        l.addNode("C");
        l.addNode("D");
        l.addNode("E");
        System.out.println("=======before delete=======");
        l.printNode();                               //输出节点
        l.deletNode("C");                       //删除节点
        System.out.println();
        System.out.println("=======after  delete=======");
        l.printNode();
        System.out.println();
        System.out.println("find the node: "+l.contains("A"));
    }
}
