package head_first_design_pattern.demo.section01.Behaviors;

public class FlyRockeyPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다잉!");
    }
}
