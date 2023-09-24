package HomeworkNr4;

public class Circle {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        double площадь = Math.PI * radius * radius;
        System.out.println("Площадь круга с радиусом " + radius + " равна " + площадь);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        circle1.calculateArea();
    }
}