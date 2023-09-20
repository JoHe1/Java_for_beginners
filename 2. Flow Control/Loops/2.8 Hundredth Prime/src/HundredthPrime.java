public class HundredthPrime
{
   public static void main(String[] args)
   {
      int cont_number_prime = 0;
      int prime_number = 1;
      boolean prime_encounter;
      while (cont_number_prime < 100) {
         prime_encounter = true;
         prime_number++;
         for (int divisor = prime_number - 1; divisor > 1; divisor--) {
            if (prime_number % divisor == 0) {
               prime_encounter = false;
               break;
            }
         }
         if (prime_encounter == true) {
            cont_number_prime++;
         }
      }
      System.out.println(prime_number);
   }
}