package head_first_design_pattern.demo.section03_decorator_pattern;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 추가";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }

}
