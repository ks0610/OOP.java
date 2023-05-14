public class Main1 {
    public static void main(String[] args){

        //instantiation
        CarL1 myCar1 = new CarL1();
        CarL1 myCar2 = new CarL1();

        //getting the attributes from the object myCar1
        System.out.println(myCar1.model);
        System.out.println(myCar1.make);

        //getting the attributes from the object myCar2
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        //calling the methods from object myCar1
        myCar1.drive();
        myCar1.brake();


    }




}
