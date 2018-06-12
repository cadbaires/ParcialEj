/**
 * Created by CarlosAdrián on 11/06/2018.
 */
public class CuentaBancaria extends Bien implements Transferible {

    public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException{

    }

    public CuentaBancaria(Titular titular){
        super();
        asignarTitular(titular);
    }
}
