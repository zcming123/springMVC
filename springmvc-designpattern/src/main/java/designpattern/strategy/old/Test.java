package designpattern.strategy.old;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:16
 */
public class Test {
    public static void main(String[] args) {
        BuyGoods buyGoods1 = new BuyGoods("Java编程思想", 99.00);
        buyGoods1.calculate("discount85");
        BuyGoods buyGoods2 = new BuyGoods("罗技⿏标", 66 );
        buyGoods2.calculate("discount6");
        BuyGoods buyGoods3 = new BuyGoods("苹果笔记本", 15000.00);
        buyGoods3.calculate("return5");
        BuyGoods buyGoods4 = new BuyGoods("佳能相机", 1900);
        buyGoods4.calculate(null);
    }
}

