package hub;

public class whole_tree {


    public static void main(String[] args) {
        int hoehe = 5;
        for (int a = 1; a <= hoehe; a++) {
            for (int b = hoehe - a; b > 0; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("**");
            }

             System.out.println();
        }
        System.out.println("    **");
    }
}
