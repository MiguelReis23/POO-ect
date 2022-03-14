package Aula02;

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        double p1x = 0;
        double p1y = 0;
        double p2x = 0;
        double p2y = 0;
        double vx = 0;
        double vy = 0;
        double dist = 0;
        Scanner input = new Scanner(in);

        out.print("P1 (x y): ");

        p1x = input.nextDouble();
        p1y = input.nextDouble();

        out.print("P2 (x y): ");
        p2x = input.nextDouble();
        p2y = input.nextDouble();
        input.close();

        vx = p1x - p2x;
        vy = p1y - p2y;
        dist = Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2));

        System.out.println(String.format("Distância entre P1 e P2: %f", dist));
    }
}
