package school;


import java.util.Scanner;

public class heartbeat {

    public static void main(String[] args) {
        double alter = 0;
        double puls = 0;
        double heartbeatswholelife;
        double minutesperyear = 60 * 24 * 365.25;
        Scanner console = new Scanner(System.in);
        System.out.println("Bitte geben sie ihr alter ein :");
        alter = console.nextInt();
        System.out.println("Bitte geben sie ihren durchschnittlichen puls in der Minute an :");
        heartbeatswholelife = console.nextDouble();

        System.out.println(heartbeatswholelife);


    }
}

