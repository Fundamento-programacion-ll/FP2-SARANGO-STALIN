
package cuenta;


public class Retiros extends Transaccion {

    public Retiros(String numCuenta) {
        super(numCuenta);
    }

    @Override
    public void ejecutar(Transaccion x) {
        String cuentaS = x.getNumCuenta();
        double cuenta = 450.00;
        double retiro = 250.50;
        double saldo = cuenta - retiro;
        System.out.println("El retiro de la cuenta: " + cuentaS +" de cantidad: " + retiro + " se realizo, su saldo era: " + cuenta
        + " su saldo actual es: " + saldo);
    }

    
}
