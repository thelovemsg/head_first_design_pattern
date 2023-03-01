package head_first_design_pattern.demo.section03_decorator_pattern;

public class Decaf extends Beverage{

    public Decaf() {
        description = "디카페인 커피";
    }

    @Override
    public double cost() {
        return .102;
    }

}
