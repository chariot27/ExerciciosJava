/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contabanco;

import java.util.Scanner;
import xyz.ukrainskiys.decimal.Decimal;

/**
 *
 * @author maxta
 */
public class ContaTerminal {
    
    void ImprimirDadosConta(int numeroConta,String agencia,String nomeCliente,Decimal saldo){
        System.out.println("Olá "+nomeCliente+" , obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");       
    }
    
    public void InserirDados(){
       ContaTerminal ct = new ContaTerminal();
       Scanner scan = new Scanner(System.in);
       System.out.println("Insira o número da conta: ");
       int numeroConta = scan.nextInt();
       System.out.println("Insira o nome da agencia: ");
       String agencia = scan.next();
       System.out.println("Insira o nome do cliente: ");
       String nomeCliente = scan.next();
       System.out.println("Insira o saldo do cliente: ");
       Decimal saldo = Decimal.of(scan.nextDouble());
       
       ImprimirDadosConta(numeroConta, agencia, nomeCliente, saldo);
      
    }

}