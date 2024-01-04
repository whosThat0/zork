package school;


import java.util.Scanner;

public class summieren {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        int count = 0;

        do {
        System.out.println("Bitte geben sie die erste Zahl ein:");
            number =console.nextDouble();

            sum += number;
            count += number != 0 ? 1 : 0;

        } while (number != 0.0);



        System.out.println(
                String.format("The sum of all the grades (%d) is %f", count, sum));
        System.out.println(
                String.format("The average is %.2f:", sum / (double) count));
        console.close();
    }
}
