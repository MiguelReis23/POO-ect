package Aula07.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
		int input;
		DateYMD date = null;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Date operations:");
			System.out.println("1 - create new date");
			System.out.println("2 - show current date");
			System.out.println("3 - increment date");
			System.out.println("4 - decrement date");
			System.out.println("0 - exit");
            System.out.print("Enter your choice: ");
			input = sc.nextInt();

			switch (input) {
				case 1:
                    System.out.print("Enter day: ");
					int day =sc.nextInt();
                    System.out.print("Enter month: ");
					int month = sc.nextInt();
                    System.out.print("Enter year: ");
					int year = sc.nextInt();

					date = new DateYMD(day, month, year);
					System.out.println("Data criada: " + date);
					break;

				case 2:
					if (date == null) {
						System.out.println("Data nao criada.");
						break;
					}
					
					System.out.println("Data atual: " + date.toString());
					break;

				case 3:
					if (date == null) {
						System.out.println("Data nao criada.");
						break;
					}

                    System.out.println("Numero de dias para incrementar: ");
					int daysplus=sc.nextInt();
					date.increment(daysplus);
					System.out.println("Data incrementada: " + date);
					break;

				case 4:
					if (date == null) {
						System.out.println("Data nao criada.");
						break;
					}
                    System.out.println("Numero de dias para decrementar: ");
					int daysminus=sc.nextInt();
					date.decrement(daysminus);
					System.out.println("Data decrementada: " + date);
					break;

				case 0:
					break;
			}

			System.out.println();
		} while (input != 0);
	sc.close();
    }

}
