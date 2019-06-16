package AdapterPattern;

public class MyDuck implements Duck {

    @Override
    public void Quack() {
        System.out.println("MyDuck Quacking...");
    }

    @Override
    public void Fly() {
        System.out.println("MyDuck Flying..");
    }
}
