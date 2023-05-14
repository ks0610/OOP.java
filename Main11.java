public class Main11 {
    public static void main(String[] args){

        //super = keyword refers to the superclass (parent) of an object
        //        very similar to the "this" keyword 


        heroL11 hero1 = new heroL11("Batman",42, "£££");
        heroL11 hero2 = new heroL11("Superman",43, "everything");


        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.toString());

    }
}
