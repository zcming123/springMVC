package designpattern.adapter;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:51
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
