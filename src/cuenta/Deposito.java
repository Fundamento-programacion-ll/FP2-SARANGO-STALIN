
package cuenta;

public class Deposito extends Transaccion {

    public Deposito(String numCuenta) {
        super(numCuenta);
    }

    @Override
    public void ejecutar(Transaccion x) {
        String cuentaS = x.getNumCuenta();
        double cuenta = 4000;
        double deposito = 345.0;
        double saldo = cuenta + deposito;
        
        System.out.println("El deposito al numero de cuenta: "+ cuentaS + " de cantidad: " + deposito + " fue realizado, su saldo anterior"
                + " era: " + cuenta + " su saldo actual es: " + saldo);
    }
    
}
