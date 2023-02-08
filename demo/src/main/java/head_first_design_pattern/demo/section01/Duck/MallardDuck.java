package head_first_design_pattern.demo.section01.Duck;

import head_first_design_pattern.demo.section01.Behaviors.FlyWithWings;
import head_first_design_pattern.demo.section01.Behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("display!");
    }
}
