package _7kyu;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class Kata {

   // Get the Middle Character
   public static String getMiddle(String word) {
      int length = word.length();
      int mid = length / 2;
      return length % 2 == 0 // word.substring(l / 2 - (1 - l % 2), l / 2 + 1);
            ? word.substring(mid - 1, mid + 1)
            : word.substring(mid, mid + 1);
   }

   // Highest and Lowest
   public static String highAndLow(String numbers) {
      List<Integer> nums = stream(numbers.split(" "))
            .map(Integer::parseInt)
            .toList();

      int max = nums.stream().mapToInt(Integer::intValue).max().orElseThrow();
      int min = nums.stream().mapToInt(Integer::intValue).min().orElseThrow();
      return max + " " + min;

//      var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
//      return stats.getMax() + " " + stats.getMin();
   }
}
