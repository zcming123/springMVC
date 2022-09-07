package designpattern.strategy.old;

import java.text.MessageFormat;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:16
 */
public class BuyGoods {
    private String goods;
    private double price;
    private double finalPrice;
    private String desc;
    public BuyGoods(String goods, double price) {
        this.goods = goods;
        this.price = price;
    }
    public double calculate(String discountType) {
        if ("discount85".equals(discountType)) {
            finalPrice = price * 0.85;
            desc = "该商品可享受8.5折优惠";
        } else if ("discount6".equals(discountType)) {
            finalPrice = price * 0.6;
            desc = "该商品可享受6折优惠";
        } else if ("return5".equals(discountType)) {
            finalPrice = price >= 5 ? price - 5 : 0;
            desc = "该商品可返现5元";
        } else {
            finalPrice = price;
            desc = "对不起，该商品不参与优惠活动";
        }
        System.out.println(MessageFormat.format("您购买的商品为：{0}，原价为：{1}，{2}，最终售卖价格为：{3}", goods, price, desc, finalPrice));
        return finalPrice;
    }
}
