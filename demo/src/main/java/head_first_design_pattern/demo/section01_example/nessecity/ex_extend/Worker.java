package head_first_design_pattern.demo.section01_example.nessecity.ex_extend;

public abstract class Worker {

    void work() {
        System.out.println("일한다!");
    }

    void rest() {
        System.out.println("쉰다!");
    }

    void payment() {
        System.out.println("임금 일당 20만원 받는다!");
    }

}
