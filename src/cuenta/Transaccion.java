
package cuenta;

abstract class Transaccion {

    private String numCuenta;

    public Transaccion(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    
   
    
    public abstract void ejecutar(Transaccion x);
    
    
    public static void main(String[] args) {
       String numCuenta = "235514123";
       Retiros retiro = new Retiros(numCuenta);
       retiro.ejecutar(retiro);
       Deposito deposito = new Deposito(numCuenta);
       deposito.ejecutar(deposito);
       solicitudSaldo saldo = new solicitudSaldo(numCuenta);
       saldo.ejecutar(saldo);
       
    }
    
}
