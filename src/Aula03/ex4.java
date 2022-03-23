package Aula03;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double inicial, sum, max, min, tmp;
        int num = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Adicionar um valor: ");
        inicial = sum = max = min = input.nextDouble();

        while (true) {
            System.out.print("Adicionar um valor: ");
            tmp = input.nextDouble();
            if (tmp == inicial)
                break;
            if (tmp < min)
                min = tmp;
            if (tmp > max)
                max = tmp;
            sum += tmp;
            num += 1;
        }
        input.close();

        System.out.println(
                String.format("Valor máximo: %.2f\nValor minimo: %.2f\nMédia dos valores: %.2f\nNúmero de valores: %d",
                        max, min, sum / num, num));
    }
}
