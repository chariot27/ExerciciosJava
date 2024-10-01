/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiobanco;

/**
 *
 * @author maxta
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
    }

    @Override
    public void imprimirEstrato() {
        System.out.println("Imprimido o estrato da conta poupansa");
        System.out.println("Saldo: "+saldo);
    }

    
}
