package _8kyu;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class SolutionTest {

   // String repeat
   @Test
   public void repeatStrTest() {
      assertEquals("aaaa", Solution.repeatStr(4, "a"));
      assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
      assertEquals("", Solution.repeatStr(5, ""));
      assertEquals("", Solution.repeatStr(0, "kata"));
   }

   // The Feast of Many Beasts
   @Test
   public void feastTest() {
      assertTrue(Kata.feast("great blue heron","garlic nann"));
      assertTrue(Kata.feast("chickadee","chocolate cake"));
      assertFalse(Kata.feast("brown bear","bear claw"));
   }

   // Will you make it?
   @Test
   public void zeroFuelTest() {
      Assertions.assertTrue(Kata.zeroFuel(50, 25, 2));
      Assertions.assertFalse(Kata.zeroFuel(100, 50, 1));
   }

   // String ends with?
   private static void checkEnds(String str, String ending, boolean expected) {
      boolean result = Kata.solution(str, ending);
      assertEquals("Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected, expected, result);
   }

   @Test
   public void stringEndsWithTest() {
      checkEnds("samurai", "ai", true);
      checkEnds("sumo", "omo", false);
      checkEnds("ninja", "ja", true);
      checkEnds("sensei", "i", true);
      checkEnds("samurai", "ra", false);
      checkEnds("abc", "abcd", false);
      checkEnds("abc", "abc", true);
      checkEnds("abcabc", "bc", true);
      checkEnds("ails", "fails", false);
      checkEnds("fails", "ails", true);
      checkEnds("this", "fails", false);
      checkEnds("this", "", true);
      checkEnds(":-)", ":-(", false);
      checkEnds("!@#$%^&*() :-)", ":-)", true);
      checkEnds("abc\n", "abc", false);
      checkEnds("hello", "lo", true);
      checkEnds("world", "rld", true);
      checkEnds("example", "ple", true);
      checkEnds("test", "est", true);
      checkEnds("case", "CASE", false);
      checkEnds("end", "end", true);
      checkEnds("mismatch", "match", true);
      checkEnds("empty", "", true);
      checkEnds("", "non-empty", false);
   }
}