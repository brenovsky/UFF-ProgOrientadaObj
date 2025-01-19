package listas.lista01;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String string_number = Integer.toString(number);

        int digits = string_number.length();

        System.out.println(digits);

        sc.close();
    }
}