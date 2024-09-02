package _7kyu;

import java.util.Arrays;

public class BrokenSequence {
   public int findMissingNumber(String sequence) {

      if (sequence.isEmpty()) return 0;

      String[] elements = sequence.split(" ");

      // ести ли нечисловаое значение
      for (String element : elements) {
         if (!element.matches("\\d+")) {
            return  1;
         }
      }

      // сортируем числа
      int[] numbers = Arrays.stream(elements)
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();

      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] != i + 1) {
            return i + 1;
         }
      }
      return 0;
   }
}