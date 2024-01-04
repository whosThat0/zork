package hub;


import java.util.Scanner;

public class Functions {


    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int givenNumber = console.nextInt();
        System.out.println(calculateRadius(givenNumber));

    }

    static double calculateRadius(int wert) {

        double skz = Math.pow(wert, 2);
        double result = skz * 3.14;
        return result;

    }


}
