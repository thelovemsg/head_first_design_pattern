package head_first_design_pattern.demo.section03_decorator_pattern;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    @Override
    public double cost() {
        return .102;
    }

}
