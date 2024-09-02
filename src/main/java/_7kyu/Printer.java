package _7kyu;

public class Printer {

   // Printer Errors
   public static String printerError(String s) {
      long errors = s.chars()
            .filter(c -> c < 'a' || c > 'm')
            .count();

      return errors + "/" + s.length();
   }
}
