public class CarL5 {
    
    //toString() = a method that all objects inherit,
    //             returns a string that "textually represents" an object (ouputs all its attributes)
    //             can be used both implicitly(behind the scenes) and explicitly(deliberatly)

    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;

    //overrinding the toString method:

    public String toString(){
        String myString = make + "\n" + model +"\n" + color + "\n" + year;
        return myString;

    }
}
