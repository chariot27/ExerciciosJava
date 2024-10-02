/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadosmoveis2;

import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class DadosMoveis2 {

   // Função para converter GB para MB
    public static int gbParaMb(int limiteGb) {
		    // TODO: Faça o calculo de conversão GB para MB, sabendo que 1 GB = 1024 MB
        int mb = limiteGb * 1024;
        return mb;
    }

    // Função principal para verificar o limite de dados móveis
    public static void verificarLimiteDeDados(int limiteGb, int consumoTotalMb) {
        // Convertendo o limite de GB para MB
        int limiteMb = gbParaMb(limiteGb);

        // TODO: Verifique se o consumo total excede o limite mensal em MB
        if (limiteMb < consumoTotalMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = limiteMb - consumoTotalMb;
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário o limite mensal de dados em GB
        int limiteGb = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();

        // Verificando o limite de dados móveis
        verificarLimiteDeDados(limiteGb, consumoTotalMb);

        scanner.close();
    }
}
