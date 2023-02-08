package head_first_design_pattern.demo.section01.Behaviors;

import head_first_design_pattern.demo.section01.Behaviors.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak!");
    }
}
