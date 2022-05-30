package TP;

import java.util.Scanner;

public class primesto1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename= sc.nextLine();
        /* open the file */
        java.io.File file = new java.io.File(filename);

        /*write in the file the prime numbers to 1000*/
        try {
            java.io.PrintWriter pw = new java.io.PrintWriter(file);
            for (int i = 2; i <= 1000; i++) {
                if (isPrime(i)) {
                    pw.println(i);
                }
            }
            pw.close();
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e);
        }
        sc.close();
    }
    
    public static boolean isPrime(int n){
        int factors = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) // ensure that you mod n not i
            factors++;
         }
        // if factors count is equals to 2 then it is prime number else it's not prime number
        if(factors == 2)
            return true;
        else
            return false;
    }
}
