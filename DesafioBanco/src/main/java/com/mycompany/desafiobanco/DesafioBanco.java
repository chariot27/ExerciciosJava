/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiobanco;

/**
 *
 * @author maxta
 */
public class DesafioBanco {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        
        cc.depositar(200);
        cc.transferir(100, cp);
        
        cc.imprimirEstrato();
        cp.imprimirEstrato();
    }
}
