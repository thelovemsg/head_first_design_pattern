package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class PaySalary implements GetPay{
    @Override
    public void pay() {
        System.out.println("일당 20만원 지급");
    }
}
