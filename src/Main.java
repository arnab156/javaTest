import java.awt.*;

public class Main {

   public static void main(String[] args){


   Cat Puchu  = new Cat("Arnab","Russian Blue Mix",0.9,9);

   System.out.println(Puchu.ownerName);

//
   System.out.println(Puchu.changeAge(1));
   System.out.println(Puchu.changeOwner("James"));

   Puchu.Meow();

  System.out.println(Puchu.inHumanYears());

   }


}
