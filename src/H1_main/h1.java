package H1_main;

import java.util.Arrays;

public class h1 {
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 5};
        int length = myArray.length;
        for(int i = 0; i < (length / 2); i++){
            int temp = myArray[i];
            myArray[i] = myArray[length-i-1];
            myArray[length-i-1] = temp ;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
