package H2_main;

import java.util.Arrays;

public class h2 {
    public static void main(String[] args){
        int n = 234351;
        int digit = 0;
        int[] a = {1,2,3,4,5,6,7,8,9};
        int j = 0;
        for(int i=1;i<10;i++){
            a[a.length-i]= (int) ((int) n % Math.pow(10,i) - j);
            a[a.length-i] /= Math.pow(10,i-1);
            j = (int) ((int) n % Math.pow(10,i));
        }
        System.out.println(Arrays.toString(a));

    }
}
