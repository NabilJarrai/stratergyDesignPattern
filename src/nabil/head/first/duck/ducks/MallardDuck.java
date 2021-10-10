package nabil.head.first.duck.ducks;

import nabil.head.first.duck.flying.FlyWithWings;
import nabil.head.first.duck.quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard Duck");
    }
}
