public class HumanL2 {
    
    //constructor = a method that is called when an object is instantiated, allows for different objects to have different attributes

    String name;
    int age;
    double weight;

    //constructor method:
    HumanL2(String name, int age, double weight){

        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //to access an objects attributes from within its own class, use 'this.attribute' (seen in the below method)
    void eat(){
        System.out.println(this.name + " is eating");

    }



}

