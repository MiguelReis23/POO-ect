package Aula05.Ex3;

public class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        assert valid(width, height);
        this.width = width;
        this.height = height;
    }
    public boolean valid(double width, double height) {
        return width > 0 && height > 0;
    }

    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }


    public void setRectangle(double width, double height) {
        this.width=width;
        this.height=height;
        assert valid(width, height);
    }

    public boolean equals(Rectangle rectangle) {
        return this.width == rectangle.getWidth() && this.height == rectangle.getHeight();
    }

    public double Area(){
        return this.width * this.height;
    }

    public double Perimeter(){
        return 2*(this.width + this.height);
    }

    public String toString(){
        return "Rectangle: " + this.width + " " + this.height;
    }

    



}
