
public class Main {
    public static void main(String[] args ){
        Dog dog = new Dog( 1, "LU LU", "black", 15.0,  5);
        Cat cat= new Cat( 2,  "MUN",  "white",  2.0,  2);

        if(dog.weight > cat.weight){
            dog.bark();
            cat.run();
        }else {
            cat.cratch();
            dog.run();
        }
    }
}
