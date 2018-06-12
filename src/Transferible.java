/**
 * Created by CarlosAdrián on 11/06/2018.
 */
public interface Transferible {

    public void transferir(Titular nuevoTitular) throws EmailNotSentException, TransferenciaInvalidaException;
}
