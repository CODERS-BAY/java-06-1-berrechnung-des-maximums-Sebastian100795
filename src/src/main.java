import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean hasQ=scanner.hasNext("q");
       int[] numbers= new int[0];
       int min=100;
       int max=0;

       while (!scanner.hasNext("q")){
           int number = scanner.nextInt();
           int[] newArray= new int[numbers.length + 1];
           for (int i = 0; i <numbers.length ; i++) {
               newArray[i]= numbers[i];
           }

           newArray[numbers.length]=number;
           numbers= newArray;
       }

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < 100; j++) {

                if (j==numbers[i]){
                    min=numbers[i];
                }else if (min<numbers[i]){
                    break;
                }
            }
        }
        System.out.println("Das minimum ist " + min);

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < 100; j++) {

                if (j==numbers[i]){
                    max=numbers[i];
                }else if (max>numbers[i]){
                    break;
                }
            }
        }
        System.out.println("Das maximum ist " + max);
        //Integer[] zahlen= new Integer[3];

       /* int min= Collections.min(Arrays.asList(zahlen));
        System.out.println(min);
        int max= Collections.max(Arrays.asList(zahlen));
        System.out.println(max);*/
    }
}
