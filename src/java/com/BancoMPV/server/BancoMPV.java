package com.BancoMPV.server;

import com.BancoMPV.datos.BankRemote;
import javax.ejb.Stateful;

/**
 * @author ingva
 */
//Con esta anotacion le estamos dando nombre a nuestro bean
@Stateful(mappedName = "stateful123")
public class BancoMPV implements BankRemote {

    //Atributo Cantidad de valor que se introducira
    private int cantidad = 0;

    //Metodo para los retiros
    public boolean retiro(int cantidad) {
        if (cantidad <= this.cantidad) {
            this.cantidad -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    //Metodo para los depositos
    public void deposito(int cantidad) {
        this.cantidad += cantidad;
    }

    //Metodo para el balance
    public int getBalance() {
        return cantidad;
    }
}
