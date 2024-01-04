package hub;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double n;
        long r;
        String o;
        System.out.println("first number to calculate ? ");


        try {
            n = console.nextDouble();

            System.out.println("second number to calculate ? ");

            try {
                r = console.nextLong();

                System.out.println("How do you want it calculated ?");
                o = console.next();

                switch (o) {
                    case "+":
                        double bts = n + r;
                        System.out.println("That would equal " + bts);
                        break;

                    case "-":
                        double newjeans = n - r;
                        System.out.println("That would equal " + newjeans);
                        break;

                    case "*":
                        double txt = n * r;
                        System.out.println("That would equal " + txt);
                        break;

                    case "/":
                        double itzy = n / r;
                        System.out.println("That would equal " + itzy);
                        break;

                    default:
                        System.out.println("This is not an operator, I can't calculate with that!");

                }
            } catch (Exception a) {
                System.out.println(" This is not a number and cant be calculated!");
            }


        } catch (Exception a) {
            System.out.println(" This is not a number and cant be calculated!");

        }

    }
}
