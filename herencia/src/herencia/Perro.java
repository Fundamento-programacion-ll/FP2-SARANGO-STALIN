package herencia;

public class Perro extends Animal{
    private float estatura;

    public Perro(float estatura) {
        this.estatura = estatura;
    }

    public Perro(float estatura, String especie, String genero, String nombre, int edad) {
        super(especie, genero, nombre, edad);
        this.estatura = estatura;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }
    public int sumaPerro(int n1, int n2){
        return suma(n1, n2);
    }
    public void datosPerro(){
        System.out.println("nombre"+getNombre()+"edad:"+getEdad()+"estatura:"+getEstatura());
    }
}
