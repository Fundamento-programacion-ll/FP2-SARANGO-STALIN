package dfigura;

public class Triangulo extends Dimension {

    public Triangulo(double lado, double base, double altura) {
        super(lado, base, altura);
    }

    public Triangulo(double lado, double base) {
        super(lado, base);
    }

    
    
    public static double area(Triangulo x){
        double base = x.getDimension1();
        double altura = x.getDimension2();
        double area;
        
        area = (base * altura)/2;
        
        return area;
        
    }
    
    public static double volumen(Triangulo x){
        
        //Area de una piramide de base cuadrada
        double lado = x.getDimension1();
        double base = x.getDimension2();
        double altura = x.getDimension3();
        double volumen;
        
        volumen = (lado * base * altura)/3;
        
        return volumen;
        
        
    }
    
    public static void imprimirTriangulo(Triangulo x){
        double area = area(x);
        double volumen = volumen(x);
        double base = x.getDimension1();
        double altura = x.getDimension2();
        double lado = x.getDimension3();
        
        System.out.println("El triangulo de base: " + base + " y altura: " + altura + " su area es: " + area
        + " y si fuese una piramide de base cuadrada su volumen seria: " + volumen);
    }
    
}
