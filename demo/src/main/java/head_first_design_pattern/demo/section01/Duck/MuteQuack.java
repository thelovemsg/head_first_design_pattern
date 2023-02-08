package head_first_design_pattern.demo.section01.Duck;

import head_first_design_pattern.demo.section01.Behaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence!");
    }
}
