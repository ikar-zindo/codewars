package _7kyu;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
   public static int sortDesc(final int num) {
      String str = Integer.toString(num)
            .chars()
            .mapToObj(c -> String.valueOf(Character.getNumericValue(c)))
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.joining());

      return Integer.parseInt(str);
   }
}