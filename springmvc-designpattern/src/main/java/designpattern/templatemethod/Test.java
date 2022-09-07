package designpattern.templatemethod;

/**
 * <p>Title:  </p>
 * <p>Description: </p>
 *
 * @author Lenovo
 * @date 2022/9/6 23:37
 */
public class Test {
    public static void main(String[] args) {
        // ⾯试Java⼯程师
        Interview interviewee1 = new Interviewee1();
        interviewee1.process();
        // ⾯试前端⼯程师
        Interview interviewee2 = new Interviewee2();
        interviewee2.process();
    }
}
