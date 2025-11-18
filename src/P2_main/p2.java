package P2_main;

public class p2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int max = 1;
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                minIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(minIndex);
    }
}
