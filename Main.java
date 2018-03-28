import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("red-head", "Rudi", 1, 2.3, new String []{"lazy","bad","vengeful"});

        cat1.meow();
        cat1.twitching();

        System.out.println(cat1.toString());
        System.out.println();

        String[] featuresCats = cat1.getFeatures();
        System.out.println("Cat's features: " + Arrays.toString(featuresCats));
        System.out.println();

        featuresCats[0] = "very active";
        featuresCats[1] = "nise";
        System.out.println("New cat's features: " + Arrays.toString(featuresCats));
        System.out.println();

        cat1.setFeatures(featuresCats);
        cat1.setAge(2);
        cat1.setColor("Black");

        System.out.println(cat1.toString());

    }

}
