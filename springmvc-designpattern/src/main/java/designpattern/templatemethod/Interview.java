package designpattern.templatemethod;

/**
 * <p>Title:  </p>
 * <p>Description: ⾯试⼤⼚流程类</p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:36
 */
public abstract class Interview {
    private final void register() {
        System.out.println("⾯试登记");
    }
    protected abstract void communicate();

    private final void notifyResult() {
        System.out.println("HR⼩姐姐通知⾯试结果");
    }

    protected final void process() {
        // 面试登记
        this.register();
        // 面试交流
        this.communicate();
        // 通知结果
        this.notifyResult();
    }
}
