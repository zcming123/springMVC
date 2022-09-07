package designpattern.strategy.now;

import designpattern.strategy.now.discount.Impl.Discount6;
import designpattern.strategy.now.discount.Impl.Discount85;
import designpattern.strategy.now.discount.Impl.NoDiscount;
import designpattern.strategy.now.discount.Impl.Return5;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:25
 */
public class Test {
    public static void main(String[] args) {
        BuyGoods buyGoods1 = new BuyGoods("Java编程思想", 99.00, new Discount85());
        buyGoods1.calculate();
        BuyGoods buyGoods2 = new BuyGoods("罗技⿏标", 66, new Discount6());
        buyGoods2.calculate();
        BuyGoods buyGoods3 = new BuyGoods("苹果笔记本", 15000.00, new Return5());
        buyGoods3.calculate();
        BuyGoods buyGoods4 = new BuyGoods("佳能相机", 1900, new NoDiscount());
        buyGoods4.calculate();
    }
}
