package hub;

import java.util.Scanner;

public class score {

    static int s = 0;

    public static void main(String [] args) {

        Scanner console = new Scanner(System.in);


        System.out.println(" What is was your exam score ?");
        s = console.nextInt ();

        if (s >= 60){
            System.out.println(" You have passed the Test");
        } else {
            System.out.println(" You have failed the Test");
        }




    }




}
