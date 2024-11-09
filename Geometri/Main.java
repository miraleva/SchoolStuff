package Geometri;

public class Main {
    public static void main(String[] args) {
        Circle MyCircle = new Circle(5);
        Rectangle MyRectangle = new Rectangle(6, 7);

        TellArea(MyRectangle);
        TellArea(MyCircle);

    }

    public static void TellArea(Area x) {
        System.out.println(x.GetArea());

    }
}

class Circle implements Area {
    int radius;
    private final double pi = 3.14;

    public Circle(int x) {
        this.radius = x;
    }

    public double GetArea() {
        return radius * pi * radius;
    }
}

class Rectangle implements Area {
    int x;
    int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public double GetArea() {
        return x * y;
    }

}

interface Area {
    public double GetArea();
}
