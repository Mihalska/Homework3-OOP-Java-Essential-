package task6;

public class Tree extends Printer  {
  public static  final String ANSI_GREEN = "\u001B[32m";
    public static final String RESET = "\033[0m";
     @Override
   void print(String value){
       System.out.println(ANSI_GREEN + value  + RESET  );

    }
}
