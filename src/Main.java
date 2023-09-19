import gornik.Circle;
import gornik.Square;
import gornik.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję do obliczenia");
        System.out.println("1 - Kwadrat");
        System.out.println("2 - Koło");
        System.out.println("3 - Trójkąt");

        int choise = scanner.nextInt();

        switch (choise){
            case 1 ->{

                System.out.println("podaj bok kwadratu");
                double x = scanner.nextDouble();
                Square square = new Square(x);
                System.out.println(square.getSideSquare());
                System.out.println(square.calculateArea());
                System.out.println(square.calculateCircuit());
                System.out.printf("Pole kwadratu wynoso %.2f \n",square.calculateArea());
                System.out.printf("Pole kwadratu o boku %.2f  wynosi %.2f\n",square.getSideSquare(),square.calculateArea());

            }
            case 2 ->{

                System.out.println("podaj promien koła");
                double a = scanner.nextDouble();
                Circle circle = new Circle(a);
                System.out.println(circle.calculateArea());
                System.out.println(circle.calculateCircuit());
            }
            case 3 ->{

                System.out.println("podaj bok a trojkąta");
                int a1 = scanner.nextInt();
                int b = scanner.nextInt();
                int h = scanner.nextInt();
                int c = scanner.nextInt();

                Triangle triangle = new Triangle(a1,b,h, c);
                System.out.println(triangle.calculateArea());
                System.out.println(triangle.calculateCircut());
            }
            default ->{

            }
        }


    }
}