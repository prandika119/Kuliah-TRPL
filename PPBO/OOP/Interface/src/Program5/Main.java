package Program5;

interface Drawable{
    void draw();
}

abstract class Shape implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing shape");
    }
    abstract void info();
}

class Circle extends Shape{
    @Override
    void info(){
        System.out.println("This is a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.info();
    }
}
