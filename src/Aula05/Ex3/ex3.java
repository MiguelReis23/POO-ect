package Aula05.Ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(1, 1, 1);
        Rectangle rectangle = new Rectangle(1, 1);

        do {
            System.out.println("1- Create a circle");
            System.out.println("2- Create a triangle");
            System.out.println("3- Create a rectangle");
            System.out.println("4- Current circle");
            System.out.println("5- Current triangle");
            System.out.println("6- Current rectangle");
            System.out.println("7- Change circle radius");
            System.out.println("8- Change triangle sides");
            System.out.println("9- Change rectangle sides");
            System.out.println("10- Print circle area");
            System.out.println("11- Print circle perimeter");
            System.out.println("12- Print triangle area");
            System.out.println("13- Print triangle perimeter");
            System.out.println("14- Print rectangle area");
            System.out.println("15- Print rectangle perimeter");
            System.out.println("16-Compare shapes");
            System.out.println("0- Exit");
            System.out.print("Choose an option: ");

            input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.println("Enter radius: ");
                    double radius = sc.nextDouble();
                    circle = new Circle(radius);
                    System.out.println("Circle:" + circle);
                    break;

                case 2:
                    System.out.println("Enter side1: ");
                    double side1 = sc.nextDouble();
                    System.out.println("Enter side2: ");
                    double side2 = sc.nextDouble();
                    System.out.println("Enter side3: ");
                    double side3 = sc.nextDouble();
                    triangle = new Triangle(side1, side2, side3);
                    System.out.println("Triangle:" + triangle);
                    break;

                case 3:
                    System.out.println("Enter width: ");
                    double width = sc.nextDouble();
                    System.out.println("Enter height: ");
                    double height = sc.nextDouble();
                    rectangle = new Rectangle(width, height);
                    System.out.println("Rectangle:" + rectangle);
                    break;

                case 4:
                    System.out.println(circle);
                    break;

                case 5:
                    System.out.println(triangle);
                    break;

                case 6:
                    System.out.println(rectangle);
                    break;

                case 7:
                    System.out.println("Enter new radius: ");
                    double newRadius = sc.nextDouble();
                    circle.setradius(newRadius);
                    System.out.println("New circle:" + circle);
                    break;

                case 8:
                    System.out.println("Enter new side1: ");
                    double newSide1 = sc.nextDouble();
                    System.out.println("Enter new side2: ");
                    double newSide2 = sc.nextDouble();
                    System.out.println("Enter new side3: ");
                    double newSide3 = sc.nextDouble();
                    triangle.setTriangle(newSide1, newSide2, newSide3);
                    System.out.println("New triangle:" + triangle);
                    break;

                case 9:
                    System.out.println("Enter new width: ");
                    double newWidth = sc.nextDouble();
                    System.out.println("Enter new height: ");
                    double newHeight = sc.nextDouble();
                    rectangle.setRectangle(newWidth, newHeight);
                    System.out.println("New rectangle:" + rectangle);
                    break;

                case 10:
                    System.out.println("Circle area:" + circle.Area());
                    break;

                case 11:
                    System.out.println("Circle perimeter:" + circle.Perimeter());

                case 12:
                    System.out.println("Triangle area:" + triangle.Area());
                    break;

                case 13:
                    System.out.println("Triangle perimeter:" + triangle.Perimeter());
                    break;

                case 14:
                    System.out.println("Rectangle area:" + rectangle.Area());
                    break;

                case 15:
                    System.out.println("Rectangle perimeter:" + rectangle.Perimeter());
                    break;

                case 16:
                    System.out.println("what shape do you want to compare?");
                    System.out.println("1- Circle");
                    System.out.println("2- Triangle");
                    System.out.println("3- Rectangle");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.println("Insert a circle: ");
                        Circle circle2 = new Circle(sc.nextDouble());
                        if (circle.equals(circle2)) {
                            System.out.println("The circles are equal");
                        } else {
                            System.out.println("The circles are not equal");
                        }
                    } else if (option == 2) {
                        System.out.println("Insert a triangle: ");
                        Triangle triangle2 = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                        if (triangle.equals(triangle2)) {
                            System.out.println("The triangles are equal");
                        } else {
                            System.out.println("The triangles are not equal");
                        }
                    } else if (option == 3) {
                        System.out.println("Insert a rectangle: ");
                        Rectangle rectangle2 = new Rectangle(sc.nextDouble(), sc.nextDouble());
                        if (rectangle.equals(rectangle2)) {
                            System.out.println("The rectangles are equal");
                        } else {
                            System.out.println("The rectangles are not equal");
                        }
                    } else {
                        System.out.println("Invalid option");

                    }

            }

        } while (input != 0);

        sc.close();
    }
}