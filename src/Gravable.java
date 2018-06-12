/**
 * Created by CarlosAdrián on 11/06/2018.
 */
public interface Gravable {

    void setAlicuota(float alicuota) throws AlicuotaInvalidaException;

    float getAlicuota();

    float calcularImpuesto();
}
