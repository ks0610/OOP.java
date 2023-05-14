import java.util.Random;

public class DiceRollerL3 {
        
    //local = declared inside a method
    //        visible only to that method

    //global = declared outside a method, but within a class
    //         visible to all parts of a class


    //variables random and number are defined within the constructor method, so are local variables. When attempting to refer to them within the roll mehod,
    //an error occurs as they are outside the variable scope. to over come this there are two ways:

    //method 1: pass random and number in as arguements to roll method:
    DiceRollerL3(){
        Random random = new Random();
        int number = 0;
        roll(random,number);
    }

    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);
    

    }

    //method 2: declare random and number as global variables outside each method:

    //Random random;
    //int number;

    //Dice(){
    //    random = new Random();
    //    roll();
    // }

    //void roll(){
    //    number = random.nextInt(6)+1;
    //    System.out.println(number);
    //}
    
}
