package P1_main;

public class p1 {
    public static void main(String[] args){
        int x=0;
        while ( x <= 10 ) {
            x = x + 1;
            System.out.println(x);
        }
        //a
        for(int i = 1; i <= 11;i++){
            System.out.println(i);
        }
        //b
        x = 0;
        do{
            x++;
            System.out.println(x);
        }
        while (x <= 10);;
    }
}
