package _7kyu;

public class Troll {
   // Disemvowel Trolls
   public static String disemvowel(String str) {
      return str.replaceAll("[aeiouAEIOU]","");
   }
}