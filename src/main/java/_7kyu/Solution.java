package _7kyu;

import preloaded.Button;

import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.regex.Pattern;

import static preloaded.Button.*;

public class Solution {

   // Likes Vs Dislikes
   public static Button likeOrDislike(Button[] buttons) {
      Button state = Nothing;

      for (Button button : buttons) { // state = (state == button) ? Nothing : button;
         switch (button) {
            case Like -> {
               if (state == Like) {
                  state = Nothing;
               } else {
                  state = Like;
               }
            }
            case Dislike -> {
               if (state == Dislike) {
                  state = Nothing;
               } else {
                  state = Dislike;
               }
            }
         }
      }
      return state;
   }

   // Regex validate PIN code
   public static boolean validatePin(String pin) {
      return pin.matches("\\d{4}|\\d{6}");
   }
}
