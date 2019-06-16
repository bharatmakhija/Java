package AdapterPattern;

public class DuckAdapter implements Duck {
    Turtle turtle;

    public DuckAdapter(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public void Quack() {
        this.turtle.giggle();
        this.turtle.giggle();

    }

    @Override
    public void Fly() {
        this.turtle.fly();
        this.turtle.fly();
        this.turtle.fly();
    }
}
