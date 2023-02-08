package head_first_design_pattern.demo.section01_example.nessecity.ex_extend;

public class Robot extends Worker{
    @Override
    void rest() {
        System.out.println("기계는 쉬지 않는다.");
    }

    @Override
    void payment() {
        System.out.println("기계는 임금이 필요없다.");
    }
}
