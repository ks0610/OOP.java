import java.util.Scanner;

public class MainL16 {
    public static void main(String[] args){

        //dynamic polymorphism = polymorphism occuring after compilation/ during run time 

        Scanner scanner = new Scanner(System.in);

        //empty animal aobject instantiated, as we don't know whether it will be a cat or a dog yet
        animalL16 animal;

        System.out.println("what animal do you want");
        System.out.println("1 = dog    2 = cat");

        int choice = scanner.nextInt();

        if(choice==1){
            //if user chooses to create a dog, animal object updates (dynamic polymorphism) 
            animal = new dogL16();
            animal.speak();
        }

        else if(choice ==2){
            //if user chooses to create a cat, animal object updates (dynamic polymorphism) 
            animal = new catL16();
            animal.speak();
        } 

        else{
            //if user makes invalid choice, animal object remains the same, and calls generic speak method (dynamic polymorphism) 
            animal = new animalL16();
            System.out.println("That was an invalid choice");
            animal.speak();
        }

        scanner.close();
    }

}
