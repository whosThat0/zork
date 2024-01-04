package hub;

public class Arrays {

    public static void main(String[] args) {

/*
        int[] arr = {55, 78, 97, 34, 17, 100};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element is " + min);

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
*/
        howItWasSupposedToBe();

    }

    private static void howItWasSupposedToBe() {

        double[] leererArray = new double[10];

        for(int i = 0; i < leererArray.length; i++) {

            leererArray[i] = Math.random();
            System.out.println(leererArray[i]);

        }
    }
}



