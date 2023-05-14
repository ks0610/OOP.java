public class dogL10 extends animalL10{
    
    //this is the overriden method, as it shares the same name as the method it inherited from the animal class, but with its own specific features.
    // @override is used to indicate that a method has been overriden, adds NO additional functionality 
    
    @Override
    void speak(){
        System.out.println("woof woof");
        
    }
}
