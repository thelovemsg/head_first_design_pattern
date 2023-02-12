package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class PayNothing implements GetPay{
    @Override
    public void pay() {
        System.out.println("임금 없음");
    }
}
