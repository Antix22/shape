package gornik;


public class Square {
    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public double getSideSquare() {
        return sideSquare;
    }

  public double calculateArea(){
        double area = Math.pow(this.sideSquare,2);
        return area;
    }
    public double calculateCircuit(){
        return Math.abs(this.sideSquare * 4);
    }

}
