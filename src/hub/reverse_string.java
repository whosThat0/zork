package hub;


public class reverse_string {


    public static void main(String [] args){

      String twice = "eciwt";

      char t = twice.charAt(4);
      char w = twice.charAt(3);
      char i = twice.charAt(2);
      char c = twice.charAt(1);
      char e = twice.charAt(0);


    String newWord = "";

      for(int counter = (twice.length() - 1); counter >= 0; counter = counter - 1) {
        char currentLetter = twice.charAt(counter);

        newWord = newWord + currentLetter;
      }

      System.out.println(newWord);


      StringBuilder builder = new StringBuilder();
      builder.append(twice);

      builder.reverse();

      String result = builder.toString();

      System.out.println(result);

    //  System.out.println(t + w + i + c + e);




/*
        System.out.println(t);
        System.out.println(w);
        System.out.println(i);
        System.out.println(c);
        System.out.println(e);
*/

    }

}
