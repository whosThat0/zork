package school;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.zeichnen();

        Square square = new Square();
        square.draw();
    }




    private void zeichnen(){
        int rows = 8;

        for (int b = 1; b <= rows; ++b) {
            for (int t = 1; t <= b; ++t) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println("*");
    }

}





