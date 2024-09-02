package _6kyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

   // Convert string to camel case
   @Test
   public void SomeUnderscoreLowerStartTest() {
      String input = "The_Stealth_Warrior";
      String output = Solution.toCamelCase(input);
      assertEquals("TheStealthWarrior", output);
   }

   @Test
   public void SomeDashLowerStartTest() {
      String input = "the-Stealth-Warrior";
      String output = Solution.toCamelCase(input);
      assertEquals("theStealthWarrior", output);
   }

   @Test
   public void SomeMixCaseTest() {
      String input = "The_Stealth-Warrior";
      String output = Solution.toCamelCase(input);
      assertEquals(("TheStealthWarrior"), output);
   }

   @Test
   public void SomeChaosCaseTest() {
      String input = "THe_SteAlth-WaRRior";
      String output = Solution.toCamelCase(input);
      assertEquals(("TheStealthWarrior"), output);
   }

   // regex pattern to check if string has all characters
   @Test
   public void regexContainsAllTest() {
      // abc
      String abc = "abc";
      String regexAbc = Kata.regexContainsAll(abc);
      Pattern patternAbc = Pattern.compile(regexAbc);

      Assertions.assertTrue(patternAbc.matcher("bca").find(),
            assertionMsg("bca", abc, regexAbc));
      Assertions.assertTrue(patternAbc.matcher("baczzz").find(),
            assertionMsg("baczzz", abc, regexAbc));
      Assertions.assertFalse(patternAbc.matcher("ac").find(),
            assertionMsg("ac", abc, regexAbc));
      Assertions.assertFalse(patternAbc.matcher("bc").find(),
            assertionMsg("bc", abc, regexAbc));
      Assertions.assertFalse(patternAbc.matcher("cb").find(),
            assertionMsg("cb", abc, regexAbc));

      // name
      String name = "name";
      String regexName = Kata.regexContainsAll(name);
      Pattern patternName = Pattern.compile(regexName);

      Assertions.assertTrue(patternName.matcher("What is your name?").find(),
            assertionMsg("What is your name?", name, regexName));
      Assertions.assertTrue(patternName.matcher("examiner").find(),
            assertionMsg("examiner", name, regexName));
      Assertions.assertTrue(patternName.matcher("enigma").find(),
            assertionMsg("enigma", name, regexName));
      Assertions.assertTrue(patternName.matcher("eman").find(),
            assertionMsg("eman", name, regexName));

      Assertions.assertFalse(patternName.matcher("man").find(),
            assertionMsg("man", name, regexName));
      Assertions.assertFalse(patternName.matcher("OK").find(),
            assertionMsg("OK", name, regexName));
      Assertions.assertFalse(patternName.matcher("eminem").find(),
            assertionMsg("eminem", name, regexName));
   }

   private String assertionMsg(String text, String letters, String regex) {
      return String.format("[%s] has no matches [%s] according to [%s].",
            text, letters, regex);
   }
}
