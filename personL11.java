public class personL11 {
    
    String name;
    int age;

    personL11(String name, int age){
        this.name = name;
        this.age = age;

    }

    //method that returns the attribute values of a person object

    public String toString(){
        return this.name +"\n"+this.age+"\n";

    }
}
