package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class EastSouthAsianWorker extends Worker{

    public EastSouthAsianWorker() {
        getPay = new PaySalary();
        takeARest = new TakeARestForMinutes();
    }

}
