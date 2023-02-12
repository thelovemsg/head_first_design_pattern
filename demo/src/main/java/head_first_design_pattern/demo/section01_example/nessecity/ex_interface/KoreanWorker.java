package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class KoreanWorker extends Worker {
    public KoreanWorker() {
        getPay = new PaySalary();
        takeARest = new TakeARestForMinutes();
    }
}
