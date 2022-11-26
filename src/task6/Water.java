package task6;

public class Water extends Printer {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String RESET = "\033[0m";
        @Override
   void print(String value ) {
      System.out.println(ANSI_BLUE + value  + RESET   );

    }
}
