package LPL01E06;

import java.util.Scanner;

public class LPL01E06 {
    public static void main(String[] args) {
        int[][] MAT01 = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < MAT01.length; i++) {
            for (int j = 0; j < MAT01.length; j++) {
                System.out.printf("Valor para posição [%d][%d] da Matriz: ", i, j);
                MAT01[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < MAT01.length; i++) {
            for (int j = 0; j < MAT01.length; j++) {
                System.out.print(MAT01[i][j] + " ");
            }
        }

        int determinanteMatriz = MAT01[0][0] * (MAT01[1][1] * MAT01[2][2] - MAT01[1][2] * MAT01[2][1])- MAT01[0][1] * (MAT01[1][0] * MAT01[2][2] - MAT01[1][2] * MAT01[2][0])+ MAT01[0][2] * (MAT01[1][0] * MAT01[2][1] - MAT01[1][1] * MAT01[2][0]);

        System.out.println("");
        System.out.println("O determinante da matriz é: " + determinanteMatriz);
    }

}
