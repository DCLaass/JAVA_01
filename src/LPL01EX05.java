//Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. 
//Lembre-se que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. 
package LPL01EX05;

import java.util.Scanner;
public class LPL01EX05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VET01 = new int[10];
        VET01[0]=0;
        VET01[1]=1;

        System.out.println("Digite um valor para a começar sua sequencia Fibonacci: ");
        VET01[2] = scanner.nextInt();

        for (int i = 2; i < VET01.length; i++) {
            VET01[i] = VET01[i - 1] + VET01[i - 2];
        }
        System.out.println("Valores na sua sequencia Fibonacci:");
        for (int i = 0; i < VET01.length; i++) {
            System.out.print(VET01[i]);
            if (i < VET01.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
