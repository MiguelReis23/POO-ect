package Aula05.Ex4;

import java.util.ArrayList;

public class User {
    private String name, course;
    private int Nmec;
    private ArrayList<Integer> books;

    public User(String name,  int Nmec, String course) {
        this.name = name;
        this.course = course;
        this.Nmec = Nmec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNmec() {
        return Nmec;
    }

    public void setNmec(int Nmec) {
        this.Nmec = Nmec;
    }

    public ArrayList<Integer> getBooks() {
        return books;
    }

    public void removebook(int id) {
        if (this.books != null)
            this.books.remove(this.books.indexOf(id));

    }

    public void addbook(int id) {
        if (this.books == null)
            this.books = new ArrayList<Integer>();
        this.books.add(id);
    }

    public boolean hasbook(int id) {
        if (this.books != null)
            return this.books.contains(id);

        return false;
    }

    public String toString() {
        return "User: " + this.name + ", " + this.course + ", " + this.Nmec;
    }

}
