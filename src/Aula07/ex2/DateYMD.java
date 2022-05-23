package Aula07.ex2;

public class DateYMD extends Date implements Comparable<DateYMD> {
    private int day, month, year;

    public DateYMD(int day, int month, int year) {
        if (!valid(day, month, year))
            throw new IllegalArgumentException("Invalid date");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void set(int day, int month, int year) {
        // definir data introduzida pelo utilizador
        if (valid(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("Data invalida!");
        }
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
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

    public int compareTo(DateYMD date2) {

        if (this.getYear() < date2.getYear())
            return -1;
        else if (this.getYear() > date2.getYear())
            return 1;

        if (this.getMonth() < date2.getMonth())
            return -1;
        else if (this.getMonth() > date2.getMonth())
            return 1;

        if (this.getDay() < date2.getDay())
            return -1;
        else if (this.getDay() > date2.getDay())
            return 1;

        return 0;
    }


    public void whatDate() {
        System.out.println("Data introduzida: " + this.day + "/" + this.month + "/" + this.year);
    }
}