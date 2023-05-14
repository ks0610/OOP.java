public class Main10 {
    public static void main(String[] args){

        //method overriding = declaring a method in a subl class which is already present in a parent class
        //                    this is done so that a child class can have its own implementation 

        dogL10 dog = new dogL10();
        dog.speak();

        animalL10 animal = new animalL10();
        animal.speak();
        

    }
}
