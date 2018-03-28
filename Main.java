public class Main {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(3,4,5);

        System.out.println("Description of the triangle1: " + triangle1.toString());
        System.out.println("Area of a triangle1: " + triangle1.getAreaTriangle());

        Triangle triangle2 = new Triangle();

        System.out.println();
        System.out.println("Description of the triangle2: " + triangle2.toString());
        System.out.println("Area of a triangle2: " + triangle2.getAreaTriangle());

        triangle2.setA(5.3);
        triangle2.setB(6.1);
        triangle2.setC(8);

        System.out.println();
        System.out.println("New description of the triangle1: " + triangle2.toString());
        System.out.println("New area of a triangle2: " + triangle2.getAreaTriangle());
        System.out.println("New area of a triangle2 (with rounding): " + triangle2.getAreaTriangleFormatPrint(2));

    }
}
