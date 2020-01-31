package herencia;

public class Gato extends Animal{
    private String colorOjos;

    public Gato(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public Gato(String colorOjos, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
        public void datosGato(){
        System.out.println(suma(1, 2));
        System.out.println("Nombre"+getNombre()+"Edad:"+getEdad()+"Color de Ojos:"+getColorOjos());
    }
}
