package figurasabst;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Figura2  {

    public static void main(String[] args) {
        /*p.Dibujo(p.getGraphics());
        JFrame ventana= new JFrame();
        ventana.add(p);
        ventana.setSize(700, 400);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        menu();
        
    }
     public static void menu(){
         
            String op="";
        do {            
            op= JOptionPane.showInputDialog(null, "Escriba una opcion \nPunto\nCirculo\nCuadrado\n3.Salir");
            if (op.equalsIgnoreCase("punto")) {
                JFrame ventana = new JFrame();
                Punto p= new Punto();
                ventana.add(p);

                ventana.setSize(700, 400);

                ventana.setVisible(true);

                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }else if (op.equalsIgnoreCase("circulo")){
                JFrame ventana = new JFrame();
                Circulo c= new Circulo();
                ventana.add(c);

                ventana.setSize(700, 400);

                ventana.setVisible(true);

                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }else if (op.equalsIgnoreCase("cuadrado")){
                JFrame ventana = new JFrame();
                Cuadrado cu=new Cuadrado();
                ventana.add(cu);

                ventana.setSize(700, 400);

                ventana.setVisible(true);

                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }else {
                op= JOptionPane.showInputDialog(null, "Escriba una opcion \nPunto\nCirculo\n3.Salir");
            }
        } while (op!="3");
        }
    
}
