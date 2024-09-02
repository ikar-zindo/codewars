package _8kyu;

public class Kata {

   // Opposite number
   public static int opposite(int number) {
      return -number;
   }

   // The Feast of Many Beasts
   public static boolean feast(String beast, String dish) {
      return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
   }

   // Will you make it?
   public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
      return (mpg * fuelLeft) >= distanceToPump;
   }

   // String ends with?
   public static boolean solution(String str, String ending) {
      return str.endsWith(ending);
   }
}
