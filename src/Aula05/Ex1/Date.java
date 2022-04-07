package Aula05.Ex1;

import java.util.Scanner;

public class Date {

    public Date(int day, int month, int year) {
        assert valid(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
        assert invariant();

    }

    public boolean invariant() {
        return valid(day, month, year);
    }

    public void set(int day, int month, int year) {
        // definir data introduzida pelo utilizador
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public static boolean ValidMonth(int month) {
        return month >= 1 && month <= 12;

    }

    public static int monthDays(int month, int year) {
        assert ValidMonth(month);
        if (month == 2) {
            if (LeapYear(year))
                return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }

    public static boolean LeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }

    public static boolean valid(int day, int month, int year) {
        // check if date is valid
        if (day < 1 || day > monthDays(month, year))
            return false;
        if (month < 1 || month > 12)
            return false;
        if (year < 1)
            return false;
        return true;
    }

    public void whatDate() {
        System.out.println("Data introduzida: " + day + "/" + month + "/" + year);
    }

    public void increment() {
        assert invariant();
        if (day < monthDays(month, year))
            day++;
        if (day == monthDays(month, year))
            day = 1;
        month++;
        if (month == 12 && day == monthDays(month, year))
            day = 1;
        month = 1;
        year++;
    }

    public void decrement() {
        assert invariant();
        if (day == 1 && month != 1)
            day = monthDays(month, year);
        month--;
        if (day != 1)
            day--;
        if (day == 1 && month == 1)
            day = monthDays(month, year);
        month = 1;
        year--;

    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    private int day, month, year;

    public static final Scanner sc = new Scanner(System.in);
}