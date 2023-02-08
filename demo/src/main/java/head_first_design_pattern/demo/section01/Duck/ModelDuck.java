package head_first_design_pattern.demo.section01.Duck;

import head_first_design_pattern.demo.section01.Behaviors.FlyNoWay;
import head_first_design_pattern.demo.section01.Behaviors.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck!");
    }
}
