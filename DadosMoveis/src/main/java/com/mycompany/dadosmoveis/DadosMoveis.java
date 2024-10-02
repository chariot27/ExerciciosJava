/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadosmoveis;

import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class DadosMoveis {

    // Função para calcular o consumo total de dados móveis
    public static void calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
       
        // TODO: Calcule o consumo total de dados móveis
        for (String cs : consumoSemanal){
          int consumo = Integer.parseInt(cs);
          total += consumo;
          
        }
        System.out.println("Total mensal: "+total+" MB");
        calcularMediaSemanal(total, consumoSemanal.length);
        
        
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static void calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
      int mediaSemanal = totalConsumo / numeroDeSemanas;
      System.out.println("Media semanal: "+mediaSemanal+" MB");
    }

    // Função para identificar a semana de maior consumo
    public static void identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        // Função para identificar a semana de maior consumo
        for (int i = 0; i < consumoSemanal.length; i++) {
            int consumo = Integer.parseInt(consumoSemanal[i].trim());
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaDeMaiorConsumo = i + 1; // Considerando o primeiro valor como o da semana 1
            }
        }

        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        calcularConsumoTotal(consumoSemanal);
        identificarSemanaDeMaiorConsumo(consumoSemanal);
        


        scanner.close();
    }
}
