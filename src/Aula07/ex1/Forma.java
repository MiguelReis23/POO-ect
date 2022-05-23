package Aula07.ex1;

public abstract class Forma {

    private String color;

    public abstract double getArea();

    public abstract double getPerimeter();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;

    }
}
