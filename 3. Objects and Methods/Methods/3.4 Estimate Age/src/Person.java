public class Person
{
   //attributes of every Person object
   private int yearBorn;
   private int yearDeceased;
   private String name;

   //constructor//
   public Person(String named, int born, int died)
   {
      name = named;
      yearBorn = born;
      yearDeceased = died;
   }

   //instance (object) method//
   public void epitaph()
   {
       System.out.printf("%s lived to an age of %d%n", name, yearDeceased - yearBorn);
   }

   public static void main(String[] args)
   {
      Person grandma = new Person("Mary", 1932, 1999);
      grandma.epitaph(); //apply method to object (yes, in this case, grandma is considered an object)
   }
}