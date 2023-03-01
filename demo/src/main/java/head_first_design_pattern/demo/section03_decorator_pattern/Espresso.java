package head_first_design_pattern.demo.section03_decorator_pattern;

public class Espresso extends Beverage{

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
