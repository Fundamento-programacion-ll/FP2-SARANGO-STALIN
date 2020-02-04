
package cuenta;


public class solicitudSaldo extends Transaccion {

    public solicitudSaldo(String numCuenta) {
        super(numCuenta);
    }

    @Override
    public void ejecutar(Transaccion x) {
        String cuentaS = x.getNumCuenta();
        double cuenta = 1537;
        System.out.println("El saldo del numero de cuenta: " + cuentaS + " es: " + cuenta);
    }
    
    
}
