/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cedula {

    
    public static void main(String[] args) {
    
        System.out.println("Ingrese el numero de cedula");
        Scanner sc = new Scanner(System.in);
        String cedula = sc.nextLine();
        
        
        if(cedula.length() == 10){
            int cedu[] = new int[10];
            
            for(int i = 0; i < cedula.length();i++){
                cedu[i] = Integer.parseInt(String.valueOf(cedula.charAt(i)));
            }
            if(validarDos(cedu) == true){
                if(validarTres(cedu) == true){
                    if(validarMod(cedu) == true){
                        System.out.println("La cedula ingresada se verifico y es: Correcta");
                    }
                    else{
                        System.out.println("La cedula ingresada se verifico y es: Incorrecta");
                    }
                }
                else{
                    System.out.println("El tercer digito debe estar entre 0 y 5");
                }
            }
            else{
                System.out.println("Los dos primeros digitos no corresponden a ninguna provincia");
            }
        }
        else{
            System.out.println("El numero de digitos ingresados es incorrecto");
        }
        
          

    
    
   
}
   private static boolean validarDos(int[] x){
       
                String n = String.valueOf(x[0]);
                n = n.concat(String.valueOf(x[1]));
                int val = Integer.parseInt(n);
                
                if(val >= 0 && val <= 24 ){
                    return true;
                }
                else{
                    return false;
                }
            }
   public static boolean validarTres(int[] x){
       if(x[2] >= 0 && x[2] < 6){
           return true;
       }
       else{
           return false;
       }
   }
   public static boolean validarMod(int[] x){
       
       int cof[] = {2,1,2,1,2,1,2,1,2};
       int val[] = new int[9];
       int sum = 0;
       int y;
       for(int i = 0; i < cof.length; i++){
           y = cof[i] * x[i]; 
           if((y >= 10)){
               y = y - 9;
               val[i] = y;
           }
           else{
               val[i] = y;
           }
       }
       for(int i = 0; i < val.length; i++){
           sum = sum + val[i];
                   
       }
       
       int res = (sum%10);
       
       if(res != 0){
           res = 10-res;
       }
       
       if(res == x[9]){
           return true;
       }
       else{
       
           return false;
       }
   }
}