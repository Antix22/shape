package gornik;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double calculateCircuit(){
        return Math.PI * 2 * this.radius;
    }
}
