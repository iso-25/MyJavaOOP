public class CocoColaApparatus {

    private int numberOfPortions = 0;
    private int separation;

    public CocoColaApparatus(int numberOfPortions, int separation) {
        this.numberOfPortions = numberOfPortions;
        this.separation = separation;
    }

    public CocoColaApparatus() {
        super();
    }

    public int getNumberOfPortions() {
        return numberOfPortions;
    }

    public void setNumberOfPortions(int numberOfPortions) {
        this.numberOfPortions = Math.abs(numberOfPortions);
    }

    public int getSeparation() {
        return separation;
    }

    public void setSeparation(int separation) {
        this.separation = Math.abs(separation);
    }

    @Override
    public String toString() {
        return "CocoColaApparatus{" +
                "numberOfPortions=" + numberOfPortions +
                ", separation=" + separation +
                '}';
    }
}
