package head_first_design_pattern.demo.section03_decorator_pattern;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
    public Size getSize(){
        return beverage.getSize();
    }
}
