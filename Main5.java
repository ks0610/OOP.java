public class Main5 {
    public static void main(String[] args){

        CarL5 car = new CarL5();

        //easy way to display object 'car' attriubutes using print statements 
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        //alternatively we can use the toString method
        //before creating our own toString method, this returns the address in memory of where this object is stored. 
        //this toString method is used implicitly (behind the scenes) in the below line 

        //System.out.println(car);

        //


    }
    
}
