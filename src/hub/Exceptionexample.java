package hub;

public class Exceptionexample {

    public static void main(String[] args) {

        String name = null;

        try {
            whatisName(name);
        } catch (NullPointerException ex) {

        }
    }

    private static void whatisName(String value) throws NullPointerException{

        //...
        if(value == null) {
            throw new NullPointerException();
        }

        System.out.println("te");
    }
}
