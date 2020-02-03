package dfigura;

public class DFigura {
    public static void main(String[] args) {
        
        Cuadrado cuadrado = new Cuadrado(4.5);
        Triangulo triangulo = new Triangulo(6, 4.5,7);
        Circulo circulo = new Circulo(6);
        
        Circulo.imprimirCirculo(circulo);
        Cuadrado.imprimirCuadrado(cuadrado);
        Triangulo.imprimirTriangulo(triangulo);
        
        
    }
    
}
