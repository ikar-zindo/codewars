package _8kyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class XORTest {
   @Test
   public void testBasic() {
      assertFalse(XOR.xor(false, false), "false xor false should be false");
      assertTrue(XOR.xor(false, true), "false xor true should be true");
      assertTrue(XOR.xor(true, false), "true xor false should be true");
      assertFalse(XOR.xor(true, true), "true xor true should be false");
   }
}
