package Program4;

abstract class Shape{
    protected String color;
    Shape (String color){
        this.color = color;
    }
    abstract void draw();
}

class Circle extends Shape{
    Circle(String color){
        super(color);
    }
    @Override
    void draw(){
        System.out.println("Drawing circle of color : " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red");
        circle.draw();
    }
}
