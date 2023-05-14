public class Main4 {
    public static void main(String[] args){

        PizzaL4 pizza1 = new PizzaL4("thin","Tomoato","mild","pineapple");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println("Bread: " + pizza1.bread);
        System.out.println("Sauce: " + pizza1.sauce);
        System.out.println("Cheese: " + pizza1.cheese);
        System.out.println("Topping: " + pizza1.topping);


        //if we were to created a pizza with no topping, a problem would occur as the 'topping' attribute would not be filled for the object
        //to overcome this, we can use overloaded constructors - mulitple constructor methods with different types/#'s of paramaters
        //now pizza objects can be instantiatiated that are 'missing' attributes 

        PizzaL4 pizza2 = new PizzaL4("thin","Tomoato","mild");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println("Bread: " + pizza2.bread);
        System.out.println("Sauce: " + pizza2.sauce);
        System.out.println("Cheese: " + pizza2.cheese);

        PizzaL4 pizza3 = new PizzaL4("thin","Tomoato");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println("Bread: " + pizza3.bread);
        System.out.println("Sauce: " + pizza3.sauce);

        PizzaL4 pizza4 = new PizzaL4("thin");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println("Bread: " + pizza4.bread);




    }
}