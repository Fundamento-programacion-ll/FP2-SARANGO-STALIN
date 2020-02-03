/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfigura;

/**
 *
 * @author Lordbot
 */
public class Cuadrado extends Dimension {

    public Cuadrado(double lado) {
        super(lado);
    }
    
    
    public static double area(Cuadrado x){
        double area = 0;
        double lado = x.getDimension1();
        
        area = lado * lado;
        
        return area;
    }
    
    public static double volumen(Cuadrado x){
        double volumen;
        double lado = x.getDimension1();
        
        volumen = Math.pow(lado, 3);
        
        return volumen;    
    }
    
    public static double perimetro(Cuadrado x){
        double perimetro;
        double lado = x.getDimension1();
        
        perimetro = 4*lado;
        
        return perimetro;
    }
   
    public static void imprimirCuadrado(Cuadrado x){
        double lado = x.getDimension1();
        double area = area(x);
        double volumen = volumen(x);
        double perimetro = perimetro(x);
        
        System.out.println("Cuadrado de lado: " + lado + " su area es: " + area + " su volumen seria: " + 
                volumen + " su perimetro es: " + perimetro);
    }
        
}


