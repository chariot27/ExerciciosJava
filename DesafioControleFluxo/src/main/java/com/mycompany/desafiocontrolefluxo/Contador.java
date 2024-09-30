/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class Contador {
    
    void Principal(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parametro: ");
        int p1 = sc.nextInt();
        
        System.out.println("Digite o segundo parametro: ");
        int p2 = sc.nextInt();
        
        try{
            Contar(p1, p2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void Contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p2>p1){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }else{
            int contagem = p1 - p2;
            System.out.println("Contagem: "+contagem);
        }
    }
    
}
