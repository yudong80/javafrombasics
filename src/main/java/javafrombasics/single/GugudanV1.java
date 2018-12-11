package javafrombasics.single;

import java.util.Scanner;

public class GugudanV1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int dan = Integer.parseInt(in.nextLine());

        System.out.println("dan : " + dan);
        for (int i=0; i< 9; ++i) {
            System.out.println( dan + " * " + (i+1) + " = " + (dan * (i+1)));
        }
    }
}
