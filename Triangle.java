public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getAreaTriangle() {

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    public String getAreaTriangleFormatPrint(int decimal) {

        if (decimal == 0){
            return Integer.toString((int) Math.round(getAreaTriangle(decimal)));
        } else {
            return Double.toString(getAreaTriangle(decimal));
        }

    }

    private Double getAreaTriangle (int decimal) {

        int dec = checkDecimal(decimal);
        return (double) (Math.round(getAreaTriangle() * dec)) / dec;

    }

    private int checkDecimal(int decimal){

        if (decimal == 0){
            return  1;
        } else {
            return (int) Math.pow(10, Math.abs(decimal));
        }

    }


}
