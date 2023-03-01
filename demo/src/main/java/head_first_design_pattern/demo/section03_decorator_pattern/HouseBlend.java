package head_first_design_pattern.demo.section03_decorator_pattern;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "하우스 플렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }

}
