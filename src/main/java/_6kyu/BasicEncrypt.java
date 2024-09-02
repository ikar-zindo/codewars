package _6kyu;

import java.util.stream.Collectors;

public class BasicEncrypt {

   // Basic Encryption
   public String encrypt(String text, int rule) {
      rule = rule % 256;
      StringBuilder encrypted = new StringBuilder();
      for (Character c : text.toCharArray()) {
         encrypted.append(Character.toChars((c + rule) % 256));
      }
      return encrypted.toString();

//      int finalRule = rule % 255;
//      return text.chars()
//            .map(c -> (c + finalRule) % 256)
//            .mapToObj(c -> (char) c)
//            .map(String::valueOf)
//            .collect(Collectors.joining());
   }
}