package head_first_design_pattern.demo.section01_example.nessecity.ex_interface;

public class Robot extends Worker{
    public Robot() {
        getPay = new PayNothing();
        takeARest = new NoRest();
    }
}
