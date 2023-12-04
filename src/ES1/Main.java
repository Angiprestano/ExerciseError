package ES1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi un numero casuale da 1 a 10");
        int casual = Integer.parseInt(scanner.nextLine());
        int[] casualNumbers = {1, 3, 6, 7, 9};
        int numb = 2;

        System.out.println();

        if (casual <= 0 | casual > 10 )  {
            System.out.println("Error");
        } else {
            System.out.println("Ecco i numeri:");
        }
        System.out.println(Arrays.toString(casualNumbers));

        scanner.close();
    }
}