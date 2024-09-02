package _7kyu;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {

   // Printer Errors
   String s;

   @Test
   public void test1() {
      s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
      assertEquals("3/56", Printer.printerError(s));
   }

   @Test
   public void test2() {
      s = "aaabbbbhaijjjm";
      assertEquals("0/14", Printer.printerError(s));
   }

   @Test
   public void test3() {
      s = "aaaxbbbbyyhwawiwjjjwwm";
      assertEquals("8/22", Printer.printerError(s));
   }
}