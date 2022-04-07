package Aula05.Ex3;

public class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        assert valid(side1, side2, side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public boolean valid(double side1, double side2, double side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2
                && side2 + side3 > side1;
    }


    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }


    public void setTriangle(double side1, double side2, double side3) {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        assert valid(side1, side2, side3);

    }

    public boolean equals(Triangle triangle) {
        return this.side1 == triangle.getSide1() && this.side2 == triangle.getSide2() && this.side3 == triangle.getSide3();
    }

    
    public double Area(){
        double p = (this.side1 + this.side2 + this.side3)/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    public double Perimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public String toString(){
        return "Triangle: " + this.side1 + " " + this.side2 + " " + this.side3;
    }
}
