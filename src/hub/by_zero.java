package hub;

import java.util.Scanner;

public class by_zero {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n;
        double r;
        System.out.println("first number to calculate ? ");
        n = console.nextDouble();

        System.out.println("second number to calculate ? ");
        r = console.nextDouble();

        if (r != 0) {
            System.out.println("You cant calculate with that");
        } else {

            System.out.println(n / r);

        }
    }

}



