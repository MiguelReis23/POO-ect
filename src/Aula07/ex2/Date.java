package Aula07.ex2;

public abstract class Date {
    private int day, month, year;

    public boolean invariant() {
        return valid(day, month, year);
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

    public abstract void set(int day, int month, int year);

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    public abstract void increment();

    public abstract void decrement();

    public void increment(int days) {
        assert invariant();
        for (int i = 0; i < days; i++) {
            increment();
        }

    }

    public void decrement(int days) {
        assert invariant();
        for (int i = 0; i < 1; i++) {
            decrement();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", this.getDay(), this.getMonth(), this.getYear());
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getDay();
		result = prime * result + getMonth();
		result = prime * result + getYear();
		return result;
	}
}
