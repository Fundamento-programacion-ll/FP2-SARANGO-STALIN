package herencia;

public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perrito=new Perro(10, "superperro", "macho", "esquimo", 5);
        perrito.datosPerro();
        
        Gato gatito=new Gato("miel", "Persa", "hembra", "gatito", 2);
        gatito.datosGato();
    }
}
