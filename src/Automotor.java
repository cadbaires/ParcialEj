/**
 * Created by CarlosAdrián on 11/06/2018.
 */
public class Automotor extends Bien implements Asegurable,Transferible,Gravable {

    private float prima;
    private float alicuota;


    @Override
    public void setAlicuota(float alicuota) throws AlicuotaInvalidaException {

    }

    @Override
    public float getAlicuota() {
        return 0;
    }

    @Override
    public float calcularImpuesto() {
        return 0;
    }

    @Override
    public void setPrima(float prima) {

    }

    @Override
    public float getPRima() {
        return 0;
    }

    @Override
    public void transferir(Titular nuevoTitular) throws EmailNotSentException, TransferenciaInvalidaException {

    }
}
