package OOP.Refence;

class Person{
    private String name;
    private int age;
    private Book book;                      //一个人有一本书
    private Person child;                   //一个人有一个child
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
    public Book getBook(){
        return book;
    }

    public void setBook(Book b) {
        book = b;
    }
    public Person getChild(){               //获得child
        return child;
    }

    public void setChild(Person child) {    //设置child
        this.child = child;
    }
}
class Book{
    private String title;
    private float price;
    private Person person;                  //一本书属于一个人
    public Book(String title,float price){  //通过构造属性设置内容
        this.setTitle(title);
        this.setPrice(price);
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }
    public float getPrice(){
        return price;
    }

    public void setPrice(float p) {
        price = p;
    }
    public Person getPerson(){                      //得到书的所有人
        return person;
    }

    public void setPerson(Person person) {          //设置书的所有人
        this.person = person;
    }
}
public class OneToOneExample {
    public static void main(String[] args){
        Person per=new Person("someone",30);//实例化Person对象
        Person cld=new Person("child",10);  //定义someone的child
        Book bk=new Book("somebook",90.0f); //实例化Book对象
        Book b=new Book("childbook",60.0f); //定义child的书
        per.setBook(bk);                               //设置对象关系：一个人-拥有->一本书
        bk.setPerson(per);                             //设置对象关系：一本书-属于->一个人
        cld.setBook(b);                                //设置对象关系：一个child-拥有->一本书
        b.setPerson(cld);                              //设置对象关系：一本书-属于->一个child
        per.setChild(cld);                             //设置对象关系：一个人-拥有->一个child
        System.out.println("from person to book-->name: "+per.getName()+"；age: "+per.getAge()+"; the name of the book: "+per.getBook().getTitle()+"; price: "+per.getBook().getPrice());
        System.out.println("from book to person-->the name of the book: "+per.getBook().getTitle()+"; price: "+per.getBook().getPrice()+"; name: "+per.getName()+"; age: "+per.getAge());
        System.out.println(per.getName()+ "'s child-->name: " +per.getChild().getName()+"; age: "+per.getChild().getAge()+"; the name of the book: "+per.getChild().getBook().getTitle()+"; price: "+per.getChild().getBook().getPrice());
    }
}