package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoolToStrTest{
   @Test void testTrue(){
      assertEquals("true", BooleanToString.convert(true));
   }

   @Test void testFalse(){
      assertEquals("false", BooleanToString.convert(false));
   }
}