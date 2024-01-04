package school;

public class Square {

    int size = 8;

    public void draw ()

    {
        for (int j = 0; j < size; j++) {

            for (int i = 0; i < size; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

