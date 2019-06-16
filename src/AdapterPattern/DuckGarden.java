package AdapterPattern;

public class DuckGarden {

    public static void main(String[] args) {

        Turtle turtle = new MyTurtle();
        Duck duck = new MyDuck();

        duck.Fly();
        duck.Quack();
        turtle.fly();
        turtle.giggle();

        System.out.println("All basic operations working fine.. \n Now lets convert turtle to duck using adapter");

        DuckAdapter turtleDuck = new DuckAdapter(turtle);

        turtleDuck.Fly();
        turtleDuck.Quack();

    }

}
