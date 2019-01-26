public class Cat {
    public int catId;
    public String type;
    public String color;
    public double weight;
    public int age;
    public Cat(int catId, String type, String color, double weight, int age){
        this.catId = catId;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }
    public void cratch(){
        System.out.println("Cào cào cào...!");
    }
    public void eat(){
        System.out.println("Ăn...!");
    }
    public void run(){
        System.out.println("run run run...!");
    }
}
