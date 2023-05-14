public class Main15 {
    public static void main(String[] args){

        //polymorphism = the ability of an object to identify as more than one type

        carL15 car = new carL15();
        bicycleL15 bicycle = new bicycleL15();
        boatL15  boat = new boatL15();

        //There is an issue - the below line of code, attempting to store each of the above objects in an array racers, will not work, as they are different objects
        //____[] racers = {car,bicycle, boat};

        //to solve this, set data type as vehicle, as they all inherit from vehicle class (polymorphism)

        vehicleL15[] racers = {car, bicycle, boat};

        for(vehicleL15 x : racers  ){
            x.go();
        }
    }
}
