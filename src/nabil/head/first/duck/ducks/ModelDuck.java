package nabil.head.first.duck.ducks;

import nabil.head.first.duck.flying.FlyNoWay;
import nabil.head.first.duck.quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }

}
