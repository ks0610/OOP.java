public class heroL11 extends personL11 {
    
    String power;
    

    heroL11(String name, int age, String power){

        //heroL11 constructor takes arguements name, age, power
        //hero class inherits from person. The person constructor method takes arguements name and age.
        //therefore, the heroL11 constructor uses super(name,age) to send these two attributes to the person constructor method (super class)
        //and as power is specific to a hero object, it is defined in the hero constructor 
        super(name,age);
        this.power = power;
    }

    public String toString(){
        return super.toString() + this.power;
    }
}
