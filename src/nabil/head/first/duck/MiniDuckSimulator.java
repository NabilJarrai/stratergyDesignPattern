package nabil.head.first.duck;

import nabil.head.first.duck.ducks.Duck;
import nabil.head.first.duck.ducks.MallardDuck;
import nabil.head.first.duck.ducks.ModelDuck;
import nabil.head.first.duck.moreflyingobjects.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();


    }
}
