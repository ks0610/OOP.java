public class PizzaL4 {
    
    //overloaded constructors = multiple constructors within a class with the same name,
    //                          but have different parameters
    //                          name + parameters = signature


    String bread;
    String sauce;
    String cheese;
    String topping;

    //main constructor method
    PizzaL4(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping= topping;

    }

    //if we were to created a pizza with no topping, a problem would occur as the 'topping' attribute would not be filled for the object
    //to overcome this, we can use overloaded constructors - mulitple constructor methods with different types/#'s of paramaters (different signatures)


    //overloaded constructor - missing topping attribute
    PizzaL4(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    //overloaded constructor - missing topping & cheese attributes
    PizzaL4(String bread, String sauce ){
        this.bread = bread;
        this.sauce = sauce;
    }

    //overloaded constructor - missing topping,cheese, and sauce attributes
    PizzaL4(String bread ){
        this.bread = bread;
    }
}
