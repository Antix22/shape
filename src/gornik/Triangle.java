package gornik;

public class Triangle {
    private int sideA;
    private int sideB;
    private int height;
    private int sideC;



    public Triangle(int sideA, int sideB, int height, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getHeight() {
        return height;
    }

    public int getSideC() {
        return sideC;
    }

    public double calculateArea(){
        return (double) (this.sideA * this.height) /2;
    }

    public int calculateCircut(){
        return this.sideA + this.sideB + this.sideC;
    }


}
