package AdapterPattern;

public class MyTurtle implements Turtle {
    @Override
    public void fly() {
        System.out.println("Myturtle flying..");
    }

    @Override
    public void giggle() {
        System.out.println("MyTurtle giggling...");
    }
}
