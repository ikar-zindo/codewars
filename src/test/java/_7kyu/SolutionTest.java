package _7kyu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import preloaded.Button;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static preloaded.Button.*;

class SolutionTest {

   // Likes Vs Dislikes
   @Test @DisplayName("Solution.likeOrDislike")
   void sampleTest() {
      assertEquals(Like,    Solution.likeOrDislike(new Button[]{Like}), "For buttons [Like]");
      assertEquals(Nothing, Solution.likeOrDislike(new Button[]{Like, Like}), "For buttons [Like, Like]");
      assertEquals(Dislike, Solution.likeOrDislike(new Button[]{Like, Dislike}), "For buttons [Like, Dislike]");
      assertEquals(Nothing, Solution.likeOrDislike(new Button[]{Like, Dislike, Dislike}), "For buttons [Like, Dislike, Dislike]");
      assertEquals(Nothing, Solution.likeOrDislike(new Button[0]), "For no buttons");
      assertEquals(Like,    Solution.likeOrDislike(new Button[]{Like, Like, Dislike, Dislike, Like, Like, Dislike, Like}), "For buttons [Like, Like, Dislike, Dislike, Like, Like, Dislike, Like]");
   }

   // Find min and max
   @Test
   void sampleTests() {
      assertArrayEquals(new int[] {1, 1}, MinMax.getMinMax(List.of(1)),     "input: [1]");
      assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(1, 2)),  "input: [1, 2]");
      assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(2, 1)),  "input: [2, 1]");
   }

   // Find the index of the second occurrence of a letter in a string
   @Test
   @DisplayName("SecondOccurrence.secondSymbol")
   void secondSymbolTest() {
      assertEquals( 3, SecondOccurrence.secondSymbol("Hello world!!!", 'l'), "Find the index of the second symbol 'l' in the string");
      assertEquals( 7, SecondOccurrence.secondSymbol("Hello world!!!", 'o'), "Find the index of the second symbol 'o' in the string");
      assertEquals(-1, SecondOccurrence.secondSymbol("Hello world!!!", 'A'), "The symbol 'A' is not in the string");
      assertEquals(-1, SecondOccurrence.secondSymbol("", 'q'),"The symbol 'q' is not in the string");
      assertEquals(-1, SecondOccurrence.secondSymbol("Hello", '!'), "The symbol '!' is not in the string");
   }

   // Regex validate PIN code
   @Test
   public void validPins() {
      assertTrue(Solution.validatePin("1234"));
      assertTrue(Solution.validatePin("0000"));
      assertTrue(Solution.validatePin("1111"));
      assertTrue(Solution.validatePin("123456"));
      assertTrue(Solution.validatePin("098765"));
      assertTrue(Solution.validatePin("000000"));
      assertTrue(Solution.validatePin("090909"));
   }

   @Test
   public void nonDigitCharacters() {
      assertFalse(Solution.validatePin("a234"));
      assertFalse(Solution.validatePin(".234"));
   }

   @Test
   public void invalidLengths() {
      assertFalse(Solution.validatePin("1"));
      assertFalse(Solution.validatePin("12"));
      assertFalse(Solution.validatePin("123"));
      assertFalse(Solution.validatePin("12345"));
      assertFalse(Solution.validatePin("1234567"));
      assertFalse(Solution.validatePin("-1234"));
      assertFalse(Solution.validatePin("1.234"));
      assertFalse(Solution.validatePin("00000000"));
   }
}
