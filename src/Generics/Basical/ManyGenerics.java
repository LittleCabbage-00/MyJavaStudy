package Generics.Basical;
//多种泛型
class Notepad<K,V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
public class ManyGenerics {
    public static void main(String[] args) {
        Notepad<String, Integer> t = new Notepad<String, Integer>();
        t.setKey("李四");
        t.setValue(20);
        System.out.println( "name: "+t.getKey()+";\nage: "+t.getValue());

    }
}
