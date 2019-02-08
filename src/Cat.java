import java.awt.*;

public class Cat {
    String ownerName;
    String breed;
    double age;
    double weight;

    public Cat(String inputName,
               String inputBreed,
               double inputAge,
               double inputweight){
        this.ownerName = inputName;
        this.breed = inputBreed;
        this.age = inputAge;
        this.weight = inputweight;
    }

    public String changeOwner(String newOwner) {
        this.ownerName = newOwner;
        return this.ownerName;
    }

    public double changeAge(double newAge){
        this.age = newAge;
        return this.age;
    }
    public void Meow(){
        System.out.println(" Meow to you!");
    }
    public double inHumanYears(){
        return this.age * 6;
    }
//    public void detroyFurniture(){
//
//    }

}
