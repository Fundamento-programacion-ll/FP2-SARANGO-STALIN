
package pkgclass;


public class fecha { 
    
    
    
    private int anno;
    private int mes;
    private int dia;

    public int getAnno() {
        return anno;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    
    public fecha(int anno, int mes, int dia) {
        this.anno = anno;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString() {
        return anno + " - " + mes + " - " + dia;
    }
    
}
