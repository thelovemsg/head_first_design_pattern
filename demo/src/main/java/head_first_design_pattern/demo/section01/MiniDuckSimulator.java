package head_first_design_pattern.demo.section01;

import head_first_design_pattern.demo.section01.Behaviors.FlyRockeyPowered;
import head_first_design_pattern.demo.section01.Duck.Duck;
import head_first_design_pattern.demo.section01.Duck.MallardDuck;
import head_first_design_pattern.demo.section01.Duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockeyPowered());
        model.performFly();
    }
}
