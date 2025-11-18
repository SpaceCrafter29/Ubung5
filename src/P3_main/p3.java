package P3_main;

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        //a
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j]++;
            }
        }
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

        //b
        int summe = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                summe += matrix[i][j];
            }
        }
        System.out.println(summe - 9);

        //c
        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ecken = {matrix[0][0], matrix[0][2], matrix[2][2], matrix[2][0]};
        int[] seiten = {matrix[0][1], matrix[1][2], matrix[2][1], matrix[1][0]};
        int ecke0 = ecken[3];
        int seite0 = seiten[3];
        ecken[3] = ecken[2];
        ecken[2] = ecken[1];
        ecken[1] = ecken[0];
        ecken[0] = ecke0;
        seiten[3] = seiten[2];
        seiten[2] = seiten[1];
        seiten[1] = seiten[0];
        seiten[0] = seite0;
        matrix = new int[][]{{ecken[0], seiten[0], ecken[1]}, {seiten[3], matrix[1][1], seiten[1]}, {ecken[3], seiten[2], ecken[2]}};
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));


    }
}
