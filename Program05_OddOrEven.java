// Write a Java Program to check whether the entered Number is Odd or Even.

import java.util.*;

public class Program05_OddOrEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number :-");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println(a + " is Even.");
            } else {
                System.out.println(a + " is Odd.");
            }
        }
    }
}
