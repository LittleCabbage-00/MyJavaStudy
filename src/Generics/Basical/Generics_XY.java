package Generics.Basical;
//用泛型写XY的坐标
class Point_<T>{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class Generics_XY {
    public static void main(String[] args) {
        Point_<Integer> p = new Point_<>();
        p.setX(10);
    }
}
