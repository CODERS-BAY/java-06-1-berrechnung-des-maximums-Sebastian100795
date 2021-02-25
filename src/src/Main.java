import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasQ = scanner.hasNext("q");
        int[] numbers = new int[0];



        while (!scanner.hasNext("q")) {
            int number = scanner.nextInt();
            int[] newArray = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                newArray[i] = numbers[i];
            }

            newArray[numbers.length] = number;
            numbers = newArray;
        }

        int minimum=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (minimum>numbers[i]){
                minimum=numbers[i];
            }
        }
        System.out.println("Das Minimum ist " + minimum);


        int maximum=numbers[0];
        for (int i = 0; i < numbers.length ; i++) {
            if (maximum<numbers[i]){
                maximum=numbers[i];
            }
        }


            System.out.println("Das maximum ist " + maximum);



        //Integer[] zahlen= new Integer[3];

       /* int min= Collections.min(Arrays.asList(zahlen));
        System.out.println(min);
        int max= Collections.max(Arrays.asList(zahlen));
        System.out.println(max);*/
    }
}
