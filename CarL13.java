public class CarL13 {
    
    private String make;
    private String model;
    private int year;

    CarL13(String make, String model, int year){
        //this.make = make;
        //this.model = model;
        //this.year = year;

        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //getter methods
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


    //setter methods
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model; 
    }

    public void setYear(int year){
        this.year = year; 
    }
}
