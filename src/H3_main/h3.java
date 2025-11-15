package H3_main;

import java.util.Arrays;

public class h3 {
    public static void main(String[] args) {
        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        int input = 6279;
        while(true) {
            for(int i = 0; i < einheiten[0].length;i++) {
                if(input >= einheiten[0][i]) {
                    while (input >= einheiten[0][i]) {
                        input -= einheiten[0][i];
                        einheiten[1][i]++;
                    }
                }
            }
            break;
        }
        System.out.println(Arrays.toString(einheiten[0]));
        System.out.println(Arrays.toString(einheiten[1]));
    }
}
