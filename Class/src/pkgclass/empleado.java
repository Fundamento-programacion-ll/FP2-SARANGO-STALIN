/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author STALIN SARANGO
 */
public class empleado { 

    private String nombre;
    private String apellidos;
    private fecha fIngreso;
    private fecha fNacimiento;
    private double salario;

    public empleado(String nombre, String apellidos, fecha fIngreso, fecha fNacimiento, double salario) { 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fIngreso = fIngreso;
        this.fNacimiento = fNacimiento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public fecha getfIngreso() {
        return fIngreso;
    }

    public fecha getfNacimiento() {
        return fNacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setfIngreso(fecha fIngreso) {
        this.fIngreso = fIngreso;
    }

    public void setfNacimiento(fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fIngreso=" + fIngreso + ", fNacimiento=" + fNacimiento + ", salario=" + salario + '}';
    }
    
   
    
    public static ArrayList<empleado> emp = new ArrayList<empleado>(); 
    public static int posicion = 0; 
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args) {
        
        int op = 7;
        
        
        
        while(op != 0){ 
            
        
        System.out.println("Eliga una opcion");
        System.out.println("1 Ingresar un nuevo Empleado");
        System.out.println("2 Mostrar empleado mas amtiguo");
        System.out.println("3 Mostrar empleado con mayor salario");
        System.out.println("4 Imprimir empleados");
        System.out.println("0 Salir");
        op = sc.nextInt();
        
        switch (op){
            case 1:
                ingresarEmp();
                break;
            case 2:
                mostrarAntiguo();
                break;
            case 3:
                mostrarSalario();
                break;
            case 4:
                imprimirEmpleados();
            case 0:
                System.out.println("Saliendo.......");
                break;
            default:
                System.out.println("Escoja una opcion valido");
                
                
        }
                
                
        
        }
        
              
    }
    
    
    public static void ingresarEmp(){ 
        
        
        String name;
        String ap;
        int yi;
        int mi;
        int di;
        int yn;
        int mn;
        int dn;
        int salario;
        
        
        System.out.print("Ingrese el Nombre del empleado: ");
        name = sc.next();
        System.out.print("Ingrese los apellidos: ");
        ap = sc.next();
        System.out.print("Ingrese el año de Ingreso: ");
        yi = sc.nextInt();
        System.out.print("Ingrese el mes de Ingreso: ");
        mi = sc.nextInt();
        System.out.print("Ingrese el dia de Ingreso: ");
        di = sc.nextInt();
        System.out.print("Ingrese el año de Nacimiento: ");
        yn = sc.nextInt();
        System.out.print("Ingrese el mes de Nacimiento: ");
        mn = sc.nextInt();
        System.out.print("Ingrese el dia de Nacimiento: ");
        dn = sc.nextInt();
        System.out.print("Ingrese el salario del empleado: ");
        salario = sc.nextInt();
        
        empleado emple = new empleado(name,ap,new fecha(yi,mi,di),new fecha(yn,mn,dn),salario); 
        emp.add(emple); 
        posicion++;
    }
    public static void mostrarAntiguo(){ 
        empleado empl; 
        
        
        int cy = 2020;
        int cm = 1;
        int cd = 25;
        
        
        int ey;
        int em;
        int ed;
        
        
        int fy;
        int fm;
        int fd;
        
        
        int my = 0;
        int mm = 0;
        int md = 0;
        
        
        int indexmy = 0;
                
        
        
        for (int i = 0; i < emp.size(); i++) {
             empl = emp.get(i);
             
             ey = empl.getfIngreso().getAnno();
             em = empl.getfIngreso().getMes();
             ed = empl.getfIngreso().getDia();
             
             fy = cy - ey;
             fm = cm - em;
             fd = cd - ed;
             
             if(fd < 0){
                 fm--;
                 fd = 30 - fd;
             }
             if(fm < 0 ){
                 fy--;
                 fm = 12 - fm;
             }
             
             if(fy > my){
                 my = fy;
                 mm = fm;
                 md = fd;
                 indexmy = i;
             }
             else if(fy == my){
                 if(fm > mm){
                    my = fy;
                    mm = fm;
                    md = fd;
                    indexmy = i;
                 }
                 else if(fm == mm){
                    if(fd > md){
                        my = fy;
                        mm = fm;
                        md = fd;
                        indexmy = i;
                    }
                 }
             }
        }
             empl = emp.get(indexmy);
             System.out.println("El empleado mas antiguo es: " + empl.getNombre() + " " + 
                     empl.getApellidos() + " con: " + my + " años " + mm + " meses " + md + " dias" );
             
    
        
    }
    public static void mostrarSalario(){ 
        empleado empl; 
        double salario; 
        double salariomy = 0;
        
        int index = 0; 
        for(int i = 0; i < emp.size(); i++){
            empl = emp.get(i);
            
            salario = empl.getSalario();
            
            if(salario > salariomy){
                salariomy = salario;
                index = i;
                        
            }
        }
        empl = emp.get(index); 
        System.out.println("El empleado con el mayor salario es: " + empl.getNombre() + " " + empl.getApellidos() + " "
                + "con:  $" + empl.getSalario());
    }
    public static void imprimirEmpleados(){ 
    for (int i = 0; i < emp.size(); i++) {
        System.out.println("Index: " + i);
      System.out.println(emp.get(i));
    }
    }
}
