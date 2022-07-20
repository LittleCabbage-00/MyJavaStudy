package JavaOftenUseClassPark;

import java.util.Observable;
import java.util.Observer;

// 继承 Observable 表示房子可以被观察
class House extends Observable{
    private float price; // 加钱

    public House(float price) {
        this.setPrice(price);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        // 每一次修改的时候都引起观察者的注意
        super.setChanged();	// 设置变化点
        super.notifyObservers(price);	// 价格被改变
        this.price = price;
    }

    @Override
    public String toString() {
        return "房价为："+this.price;
    }
}

// 设置房子的具体观察者
class HousePriceObserver implements Observer{
    private String name;

    public HousePriceObserver(String name) {
        // 设置每一个观察的名字
        this.name = name;
    }

    /**
     * 当变化之后，就会自动触发该方法
     */
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Float){
            System.out.println(this.name+" 观察到价格更改为：" + arg);
        }
    }
}

public class ObservableClass {
    public static void main(String[] args) {
        // 创建可观察对象
        House h = new House(100000);
        // 创建购房者
        HousePriceObserver hpo1 = new HousePriceObserver("购房者 A");
        HousePriceObserver hpo2 = new HousePriceObserver("购房者 B");
        HousePriceObserver hpo3 = new HousePriceObserver("购房者 C");
        // 添加可观察对象
        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);

        System.out.println(h);	// 输出房子的价格
        h.setPrice(600000);		// 修改房子价格
        System.out.println(h);	// 输出房子的价格


    }
}
