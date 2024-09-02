package _7kyu;

public class SecondOccurrence {

   // Find the index of the second occurrence of a letter in a string
   public static int secondSymbol(String str, char c) {
      int count = 0;
      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == c) {
            count++;
            if (count == 2) {
               return i;
            }
         }
      }
      return -1;
   }
}