/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiobanco;

/**
 *
 * @author maxta
 */
public abstract class Conta implements IConta {
    
    protected static final int AGP = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    public static int SEQ = 1;
    
    public Conta() {
        this.agencia = AGP;
        this.numero = SEQ++;
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
