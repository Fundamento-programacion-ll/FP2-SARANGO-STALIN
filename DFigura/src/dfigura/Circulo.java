package dfigura;

public class Circulo extends Dimension{

    public Circulo(double lado) {
        super(lado);
    }
    
    public static double circunferencia(Circulo x){
        double circunferencia;
        double radio = x.getDimension1();
        
        circunferencia = 2 * Math.PI * radio;
        
        return circunferencia;
    }
    public static void imprimirCirculo(Circulo x){
        double circunferencia = circunferencia(x);
        double radio = x.getDimension1();
        
        System.out.println("El circulo de radio: " + radio + " su circunferencia es: " + circunferencia);
    }
}
