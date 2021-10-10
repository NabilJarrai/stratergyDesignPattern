package nabil.head.first.duck.quacking;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("<<Silent>>");
    }
}
