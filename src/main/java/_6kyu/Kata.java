package _6kyu;

import java.util.stream.Collectors;

public class Kata {

   // regex pattern to check if string has all characters
   public static String regexContainsAll(String str) {
      StringBuilder regex = new StringBuilder();
      for (char c : str.toCharArray()) {
         regex.append("(?=.*").append(c).append(")");
      }
      return regex.toString(); // str.replaceAll(".", "(?=.*$0)");

//      return str.chars()
//            .mapToObj(c -> String.format("(?=.*%c)", (char) c))
//            .collect(Collectors.joining());
   }
}
