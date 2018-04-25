import java.util.ArrayDeque;

import static javafx.scene.input.KeyCode.T;

public class Main {

    public static void main(String[] args) {

        CocoColaApparatus cocoColaApparatus = new CocoColaApparatus(2, 2);

        ArrayDeque<Human> myQueue = new ArrayDeque<>();
        myQueue.addLast(new Human("Sheldon"));
        myQueue.addLast(new Human("Leonard"));
        myQueue.addLast(new Human("Volovitc"));
        myQueue.addLast(new Human("Kutrapalli"));
        myQueue.addLast(new Human("Penny"));

        useCocaCola(cocoColaApparatus, myQueue);

        System.out.println(myQueue);

    }

    private static void useCocaCola(CocoColaApparatus cocoColaApparatus, ArrayDeque arrayDeque){

        if (cocoColaApparatus == null || arrayDeque.size() == 0){
            return;
        }

        int numberOfPortions = cocoColaApparatus.getNumberOfPortions();
        int separation = cocoColaApparatus.getSeparation();

        for (int i = 0; i < numberOfPortions; i++) {

            Human human = pollFirstDeque(arrayDeque);

            if (human == null){
                continue;
            }

            for (int j = 0; j < separation; j++) {
                arrayDeque.addLast(human);
            }

        }

    }

    public static <T extends Human> T pollFirstDeque(ArrayDeque<T> arrayDeque){
        return arrayDeque.pollFirst();
    }

}
