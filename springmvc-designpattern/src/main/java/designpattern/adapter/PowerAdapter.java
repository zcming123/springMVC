package designpattern.adapter;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:50
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;
    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器...
        int adapterOutput = adapterInput/44;
        System.out.println("使⽤ PowerAdapter 输⼊AC:" + adapterInput + "V 输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
