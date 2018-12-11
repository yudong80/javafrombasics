package javafrombasics.single;

import java.util.Scanner;

public class EvenOddNumbersV2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            int number = Integer.parseInt(in.nextLine());

            if (number % 2 == 0) {
                System.out.println("this is even number.");
            } else {
                System.out.println("this is odd number.");
            }
        }
    }
}
