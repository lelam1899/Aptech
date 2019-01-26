public class Dog {
    public int dogId;
    public String type;
    public String color;
    public double weight;
    public int age;
    public Dog(int dogId, String type, String color, double weight, int age){
        this.dogId = dogId;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }
    public void bark(){
        System.out.println("Gâu gâu gâu...vv");
    }
    public void eat(){
        System.out.println("Ăn...!");
    }
    public void run(){
        System.out.println("Run run run...!");
    }
}
