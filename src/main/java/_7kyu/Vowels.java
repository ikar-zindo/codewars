package _7kyu;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
   public static int getCount(String str) {
      Set<Character> vowels = new HashSet<>();
      for (char c : "aeiou".toCharArray()) { // without 'y'
         vowels.add(c);
      }

      int count = 0;

      for (char c : str.toCharArray()) {
         if (vowels.contains(c)) {
            count++;
         }
      }
      return count; // str.replaceAll("[^aeiou]","").length();
   }
}
