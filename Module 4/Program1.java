abstract class ShapeBase {
    abstract double area();
}

class CircleShape extends ShapeBase {
    double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends ShapeBase {
    double length, width;

    RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class ShapeAbstractDemo {
    public static void main(String[] args) {
        ShapeBase c = new CircleShape(5);
        ShapeBase r = new RectangleShape(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}