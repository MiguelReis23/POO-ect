package Aula07.ex2;

public class DateND extends Date {

    private int daysPast;

    public DateND(int day, int month, int year) {
        set(day, month, year);

    }

    private DateYMD convertDateYMD() {
        DateYMD date = new DateYMD(1, 1, 2000);

        if (daysPast < 0)
            date.decrement(daysPast);

        else if (daysPast > 0)
            date.increment(daysPast);

        return date;
    }

    public void set(int day, int month, int year) {
        // definir data introduzida pelo utilizador
    DateYMD firstDate = new DateYMD(1, 1, 2000);
    DateYMD lastDate = new DateYMD(day, month, year);
        int daysDiference = 0;
    if (lastDate == firstDate) {
        daysDiference = 0;
    } else if (lastDate.compareTo(firstDate) < 0) {
        while (lastDate.compareTo(firstDate) < 0) {
            firstDate.decrement();
            daysDiference -= 1;
        }
    } else {
        while (lastDate.compareTo(firstDate) > 0) {
            firstDate.increment();
            daysDiference += 1;
        }

        this.daysPast= daysDiference;
    }}

    public int getDay() {
        return this.convertDateYMD().getDay();
    }

    public int getMonth() {
        return this.convertDateYMD().getMonth();
    }

    public int getYear() {
        return this.convertDateYMD().getYear();
    }

    public void increment() {
        daysPast++;
    }

    public void decrement() {
        daysPast--;
    }

    public int compare(DateND date2) {
        if (this.daysPast == date2.daysPast)
            return 0;
        else if (this.daysPast < date2.daysPast)
            return -1;
        else
            return 1;
    }
}