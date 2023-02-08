package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class KoreanWorker extends Worker implements TakeARest, GetPay{

    @Override
    public void rest() {
        System.out.println("1시간 일, 20분 휴식");
    }

    @Override
    public void pay() {
        System.out.println("임금 일당 20만!");
    }
}
