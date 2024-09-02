package _6kyu;

public class Solution {

   // Convert string to camel case
   static String toCamelCase(String str) {
      String[] words = str.split("[-_]");
      StringBuilder resultWords = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
         if (words[i].isEmpty()) {
            continue;
         }

         if (i == 0) {
            resultWords
                  .append(words[i].charAt(0))
                  .append(words[i].substring(1).toLowerCase());
         } else {
            resultWords
                  .append(words[i].substring(0, 1).toUpperCase())
                  .append(words[i].substring(1).toLowerCase());
         }
      }
      return resultWords.toString();

      // спорно
//      return Arrays.stream(words, 1, words.length)
//            .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//            .reduce(words[0], String::concat);
   }
}
