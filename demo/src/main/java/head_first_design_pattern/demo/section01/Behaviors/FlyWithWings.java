package head_first_design_pattern.demo.section01.Behaviors;

import head_first_design_pattern.demo.section01.Behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly!");
    }
}
