public class friendL8 {

    //static =  a modifier (modifies the behavior of classes, variables, and methods.)
    //          A single copy of a variable/method is created and shared between all instances of the class.
    //          if one instance of the class changes the value of a static variable, the change will be reflected in all other instances of the class.
    // static methods = When a method is declared as static, it means that the method can be called without creating an instance of the class. 
    //                 Static methods are commonly used for utility functions that don't depend on any instance variables. E.g math round()

    String name;

    //static variable NumberOfFriends decared
    static int numberOfFriends;

    //constructor
    friendL8(String name){
        this.name = name;
        numberOfFriends++;

    }


}
