public class HundredthPrime
{
   public static void main(String[] args) {
      int prime_number = 1;
      int prime_counter = 0;
      boolean prime_encounter;
      while (prime_counter < 100) {
         prime_number++;
         prime_encounter = true;
         for (int divisor = prime_number - 1; divisor > 1; divisor--) {
            if (prime_number % divisor == 0) {
               prime_encounter = false;
               break;
            }
         }
         if (prime_encounter == true) {
            prime_counter++;
         }
      }
      System.out.println(prime_number);
   }
}