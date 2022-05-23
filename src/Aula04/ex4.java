package Aula04;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        /*Escreva um programa que lê do teclado uma data composta pelo mês, pelo ano, e ainda pelo
dia da semana em que começa esse mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5
= Sexta, 6 = Sábado, 7 = Domingo) e que desenha no monitor o calendário desse mês. Implemente a funcionalidade pretendida com três funções:
leitura de valores, cálculo de dias no mês e impressa
o de resultados.
    
February 2019
Su Mo Tu We Th Fr Sa
               1  2
3  4  5  6  7  8  9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28*/
   
    int[] values = readValues();
        drawCalendar(values[0], values[1], values[2]);
    }

    public static int[] readValues() {
        Scanner input = new Scanner(System.in);
        System.out.print("Mês: ");
        int month = input.nextInt();
        System.out.print("Ano: ");
        int year = input.nextInt();
        System.out.print("Dia da semana em que começa o mes: ");
        int weekDay = input.nextInt();
        input.close();
        return new int[] { month, year, weekDay };
    }

    public static int numberOfDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) return 29;
            return 28;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
        return 31;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void drawCalendar(int month, int year, int weekDay) {
		int days = numberOfDaysInMonth(month, year);
		String monthName = getMonthName(month);

		int monthNameLength = monthName.length();
		int yearLength = String.valueOf(year).length();
		int padding = (20 - monthNameLength - yearLength) / 2;
		String paddingString = "";
		for (int i = 0; i < padding; i++) paddingString += " ";
		
		System.out.println(paddingString + monthName + " " + year + paddingString);
		System.out.println("Su Mo Tu We Th Fr Sa");

		for (int i = 0; i < weekDay; i++) System.out.print("   ");

		for (int i = 1; i <= days; i++) {
			System.out.printf("%2d ", i);
			if ((i + weekDay) % 7 == 0 || i == days) System.out.println();
		}
    }
    public static String getMonthName(int month) {
		switch (month) {
			case 1: return "January";
			case 2: return "February";
			case 3: return "March";
			case 4: return "April";
			case 5: return "May";
			case 6: return "June";
			case 7: return "July";
			case 8: return "August";
			case 9: return "September";
			case 10: return "October";
			case 11: return "November";
			case 12: return "December";
			default: return "";
		}
	}
    
}


    

