package POO.src.Aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        final int Months = 3;
        out.print("Money Invested: ");
        double inv = input.nextDouble();
        out.print("Interest Rate: ");
        double tax = input.nextDouble();
        for (int i = 1; i <= Months; i++) {
            inv += (inv * (tax / 100));
        }
        out.println("Investido: " + inv);
        input.close();
    }
}