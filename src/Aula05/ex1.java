package Aula05;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date(1, 1, 1);
        int op;
        do {
            System.out.println("-------------------");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.print("Selecione uma opcao: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Dia:");
                int day = sc.nextInt();
                System.out.print("Mês:");
                int month = sc.nextInt();
                System.out.print("Ano:");
                int year = sc.nextInt();
                date.set(day, month, year);
            }

            if (op == 2)
                date.whatDate();

            if (op == 3)
                date.increment();

            if (op == 4)
                date.decrement();

            

            
        } while (op != 0);
        System.exit(1);
        sc.close();
    }
}
