import java.util.Arrays;

public class Cat {

    private String color = "Black";
    private String name = "Yagi";
    private int age = 2;
    private double weight = 2.8;
    private String [] features;

    public Cat(String color, String name, int age, double weight, String[] features) {
        this.color = color;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.features = features;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] getFeatures() {
        return features;
    }

    public void setFeatures(String[] features) {
        this.features = features;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", preferences=" + Arrays.toString(features) +
                '}';
    }

    public void twitching(){
        System.out.println("rrr-rrr-rrr-rrr-rrr");
    }

    public void meow(){
        System.out.println("mew - mew");
    }

}

