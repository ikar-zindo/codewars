package _8kyu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrassHopperTest {

   // Grasshopper - Summation
   @Test
   public void test1() {
      assertEquals(1,
            GrassHopper.summation(1));
   }
   @Test
   public void test2() {
      assertEquals(36,
            GrassHopper.summation(8));
   }
}