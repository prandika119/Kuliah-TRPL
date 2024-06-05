// PROGRAM 1
abstract class Fruit {
    abstract void displayTaste();
}
class Apple extends Fruit{
    @Override
    void displayTaste(){
        System.out.println("Appla is sweet");
    }
}

class Orange extends Fruit{
    @Override
    void displayTaste(){
        System.out.println("Orange is tangy");
    }
}

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();
        apple.displayTaste();
        orange.displayTaste();
    }
}