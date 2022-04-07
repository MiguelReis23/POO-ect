package Aula05.Ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = new Calendar(2000, 1);
        int input;

        do {
            System.out.println();
            System.out.println("Calendar Menu:");
            System.out.println("1-Create New Calendar");
            System.out.println("2-Print Calendar Month");
            System.out.println("3-Print Calendar");
            System.out.println("0-Exit");
            System.out.print("What operation you desire: ");
            

            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    System.out.print("Day of Week: ");
                    int weekday = sc.nextInt();
                    calendar = new Calendar(year, weekday);
                    break;
                case 2:
                    System.out.print("Month: ");
                    int month = sc.nextInt();
                    calendar.printMonth(month);
                    break;
                case 3:
                    calendar.toString();
                    break;
                case 0:
                    System.out.println("End!");
                    break;
            }

        } while (input != 0);

        sc.close();
    }
}
