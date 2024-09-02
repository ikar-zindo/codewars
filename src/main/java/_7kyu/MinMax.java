package _7kyu;

import java.util.Comparator;
import java.util.List;

class MinMax {

   // Find min and max
   static int[] getMinMax(List<Integer> list) {
      return new int[]{
            list.stream().min(Comparator.naturalOrder()).orElseThrow(),
            list.stream().max(Comparator.naturalOrder()).orElseThrow()
      }; // new int[]{ Collections.min(list), Collections.max(list) };
   }
}
