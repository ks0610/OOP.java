public class Main12 {
    public static void main(String[] args){

        //abstract = abstract classes cannot be instantiated, but they can have a subclass
        //           abstract methods are declared without an implementation 
        // abstract is used to add layer of security - prevents a vague object being instantiated e.g a vehicle 

        //vehicleL12 vehicle = new vehicleL12();
        carL12 car = new carL12();
        car.go();

    }
}
