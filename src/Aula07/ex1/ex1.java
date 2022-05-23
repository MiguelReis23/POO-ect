package Aula07.ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {

        int input;

        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        Scanner sc = new Scanner(System.in);

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
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    System.out.print("Enter color: ");
                    String Circlecolor = sc.next();
                    Circle Circle = new Circle(radius, Circlecolor);
                    circles.add(Circle);
                    System.out.println("Circle:" + Circle);
                    break;

                case 2:
                    System.out.print("Enter side1: ");
                    double side1 = sc.nextDouble();
                    System.out.print("Enter side2: ");
                    double side2 = sc.nextDouble();
                    System.out.print("Enter side3: ");
                    double side3 = sc.nextDouble();
                    System.out.print("Enter color: ");
                    String Trianglecolor = sc.next();
                    Triangle Triangle = new Triangle(side1, side2, side3, Trianglecolor);
                    triangles.add(Triangle);
                    System.out.println("Triangle:" + Triangle);
                    break;

                case 3:
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    System.out.print("Enter color: ");
                    String Rectanglecolor = sc.next();
                    Rectangle Rectangle = new Rectangle(width, height, Rectanglecolor);
                    rectangles.add(Rectangle);
                    System.out.println("Rectangle:" + Rectangle);
                    break;

                case 4:
                    System.out.println(circles.get(circles.size() - 1));
                    break;

                case 5:
                    System.out.println(triangles.get(triangles.size() - 1));
                    break;

                case 6:
                    System.out.println(rectangles.get(rectangles.size() - 1));
                    break;

                case 7:
                    System.out.print("Enter new radius: ");
                    double newRadius = sc.nextDouble();
                    System.out.print("Enter new color:");
                    String newCirclecolor = sc.next();
                    circles.get(circles.size() - 1).setradius(newRadius);
                    circles.get(circles.size() - 1).setColor(newCirclecolor);
                    System.out.println("New circle:" + circles.get(circles.size() - 1));
                    break;

                case 8:
                    System.out.print("Enter new side1: ");
                    double newSide1 = sc.nextDouble();
                    System.out.print("Enter new side2: ");
                    double newSide2 = sc.nextDouble();
                    System.out.print("Enter new side3: ");
                    double newSide3 = sc.nextDouble();
                    System.out.print("Enter new color:");
                    String newTrianglecolor = sc.next();
                    triangles.get(triangles.size() - 1).setTriangle(newSide1, newSide2, newSide3);
                    triangles.get(triangles.size() - 1).setColor(newTrianglecolor);
                    System.out.println("New triangle:" + triangles.get(triangles.size() - 1));
                    break;

                case 9:
                    System.out.print("Enter new width: ");
                    double newWidth = sc.nextDouble();
                    System.out.print("Enter new height: ");
                    double newHeight = sc.nextDouble();
                    System.out.print("Enter new color:");
                    String newRectanglecolor = sc.next();
                    rectangles.get(rectangles.size() - 1).setRectangle(newWidth, newHeight);
                    rectangles.get(rectangles.size() - 1).setColor(newRectanglecolor);
                    System.out.println("New rectangle:" + rectangles.get(rectangles.size() - 1));
                    break;

                case 10:
                    System.out.println("Circle area:" + circles.get(circles.size() - 1).getArea());
                    break;

                case 11:
                    System.out.println("Circle perimeter:" + circles.get(circles.size() - 1).getPerimeter());

                case 12:
                    System.out.println("Triangle area:" + triangles.get(triangles.size() - 1).getArea());
                    break;

                case 13:
                    System.out.println("Triangle perimeter:" + triangles.get(triangles.size() - 1).getPerimeter());
                    break;

                case 14:
                    System.out.println("Rectangle area:" + rectangles.get(rectangles.size() - 1).getArea());
                    break;

                case 15:
                    System.out.println("Rectangle perimeter:" + rectangles.get(rectangles.size() - 1).getPerimeter());
                    break;

                case 16:
                    System.out.println("what shape do you want to compare?");
                    System.out.println("1- Circle");
                    System.out.println("2- Triangle");
                    System.out.println("3- Rectangle");
                    int option = sc.nextInt();
                    if (option == 1) {
                        System.out.println("Insert radius: ");
                        radius = sc.nextDouble();
                        System.out.println("Insert color: ");
                        Circlecolor = sc.next();
                        Circle circle2 = new Circle(radius, Circlecolor);
                        if (circles.get(circles.size() - 1).equals(circle2)) {
                            System.out.println("The circles are equal");
                        } else {
                            System.out.println("The circles are not equal");
                        }
                    } else if (option == 2) {
                        System.out.println("Insert the triangle sides: ");
                        side1 = sc.nextDouble();
                        side2 = sc.nextDouble();
                        side3 = sc.nextDouble();
                        System.out.println("Insert color: ");
                        Trianglecolor = sc.next();
                        Triangle triangle2 = new Triangle(side1, side2, side3, Trianglecolor);
                        if (triangles.get(triangles.size() - 1).equals(triangle2)) {
                            System.out.println("The triangles are equal");
                        } else {
                            System.out.println("The triangles are not equal");
                        }
                    } else if (option == 3) {
                        System.out.println("Insert the rectangle sides: ");
                        width = sc.nextDouble();
                        height = sc.nextDouble();
                        System.out.println("Insert color: ");
                        Rectanglecolor = sc.next();
                        Rectangle rectangle2 = new Rectangle(width, height, Rectanglecolor);
                        if (rectangles.get(rectangles.size() - 1).equals(rectangle2)) {
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
