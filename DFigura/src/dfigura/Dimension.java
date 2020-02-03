
package dfigura;

public class Dimension {
    
    private double dimension1;
    private double dimension2;
    private double dimension3;

    public Dimension(double lado, double base, double altura) {
        this.dimension1 = lado;
        this.dimension2 = base;
        this.dimension3 = altura;
    }

    public Dimension(double lado, double base) {
        this.dimension1 = lado;
        this.dimension2 = base;
    }

    public Dimension(double lado) {
        this.dimension1 = lado;
    }

    public double getDimension1() {
        return dimension1;
    }

    public void setDimension1(double lado) {
        this.dimension1 = lado;
    }

    public double getDimension2() {
        return dimension2;
    }

    public void setDimension2(double base) {
        this.dimension2 = base;
    }

    public double getDimension3() {
        return dimension3;
    }

    public void setDimension3(double altura) {
        this.dimension3 = altura;
    }

    
}
