package com.BancoMPV.datos;

import javax.ejb.Remote;

/**
 *
 * @author ingva
 */
@Remote
public interface BankRemote {

    //Retiro de efectivo (Withdraw)
    boolean retiro(int cantidad);

    //Depositos (Deposit)
    void deposito(int cantidad);

    //Buscar el balance
    int getBalance();
}
