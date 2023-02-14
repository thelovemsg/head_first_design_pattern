package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class WorkerSimulator {
    public static void main(String[] args) {
        Worker koreanWorker = new KoreanWorker();
        koreanWorker.getPay();
        koreanWorker.takeARest(10);

        Worker robotWorker = new Robot();
        robotWorker.getPay();
        robotWorker.takeARest(0);
        robotWorker.setPayPolicy(new PaySalary());
        robotWorker.getPay();
    }
}
