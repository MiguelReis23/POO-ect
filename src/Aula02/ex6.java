package Aula02;

import java.util.Scanner;
import static java.lang.System.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int sec, h, m;
        do {
            out.print("Segundos: ");
            if (!input.hasNextInt())
                err.println("Erro:Numero deve ser inteiro!");
            sec = input.nextInt();
        } while (sec < 0);
        h = sec / 3600;
        m=(sec % 3600)/60;
        sec=(sec % 3600)%60;
        out.println("Resultado: ");
        out.println(String.format("%02d:%02d:%02d", h, m, sec));
        input.close();
    }
}
