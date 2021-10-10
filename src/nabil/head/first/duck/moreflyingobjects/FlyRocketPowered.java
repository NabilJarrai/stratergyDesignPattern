package nabil.head.first.duck.moreflyingobjects;

import nabil.head.first.duck.flying.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying on a rocket");
    }
}
