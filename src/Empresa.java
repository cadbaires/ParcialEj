/**
 * Created by CarlosAdrián on 11/06/2018.
 */

import java.util.*;

public class Empresa {

    private String nombre;
    private List<Bien> bienes;
    private static Empresa instancia;

    private Empresa(){
        nombre= "Empresa unica";
        bienes= new ArrayList<>();
    }

    public static Empresa getInstancia(){
        if (instancia==null){
                instancia= new Empresa();
        }
        return instancia;
    }


    public void agregarBien(Bien b) throws BienExistenteException {

        for (Bien x : bienes) {
          if (x.equals(b)){
              throw new BienExistenteException();
          }
        }
        bienes.add(b);
    }
    public void quitarBien(Bien b) throws BienInexistenteException{
        boolean encontrado = false;
        if(bienes.remove(b)){
            throw new BienInexistenteException();
        }

    }

    public void mostrarBienes(Titular titular){
        for(Bien x: bienes){
            if(x.getTitular().equals(titular)){
                System.out.println("");
            }
        }
    }

    public static void notificarTransferencia(Titular titular, int codigo) throws EmailNotSentException{
        //sendMail(titular,getEmail()...);
        System.out.println("Se envia un mail a"+titular.getNombre()+"por la transferencia de titular");
    }


    public static void main(String[] args){
        Empresa empresa;
        empresa= Empresa.getInstancia();
        //empresa2= Empresa.getInstancia(); //no debería funcionar por Singleton

        Titular titular1= new Titular("Juan","Perez");
        Titular titular2= new Titular("Laura","Lopez");

        Automotor auto= new Automotor();
        //auto.asignarTitular(titular1);
        auto.setValorFiscal(100);
        auto.setValorMercado(120);
        CuentaBancaria cuenta= new CuentaBancaria(titular1);

        try{

            auto.setAlicuota((float) 1.5);
            empresa.agregarBien(auto);
            empresa.agregarBien(cuenta);
            auto.transferir(titular1);
            System.out.println("El impuesto del auto "+auto+" es: "+auto.calcularImpuesto());

        }catch(BienExistenteException e){
            System.out.println("El bien ya existe");
        } catch (TransferenciaInvalidaException e) {
            System.out.println("La transferencia es inválida");
        } catch (EmailNotSentException e) {
            System.out.println("El mail es inválido");
        }catch (AlicuotaInvalidaException e){
            System.out.println("La alicuota es inválida");
        }

        empresa.mostrarBienes(titular2);

    }
}
