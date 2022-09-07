package designpattern.strategy.now.discount;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:26
 */
public abstract class AbstractDiscount {

    public double getFinalPrice() {
        return finalPrice;
    }
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    protected double finalPrice;
    protected String desc;

    public AbstractDiscount(String desc) {
        this.desc = desc;
    }
    public abstract double discount(double price);
}
