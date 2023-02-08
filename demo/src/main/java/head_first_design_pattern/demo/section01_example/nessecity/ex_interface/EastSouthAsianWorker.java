package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class EastSouthAsianWorker extends Worker implements GetPay, TakeARest{
    @Override
    public void pay() {
        System.out.println("임금 일당 10만!");
    }

    @Override
    public void rest() {
        System.out.println("2시간 근무, 30분 휴식!");
    }
}
