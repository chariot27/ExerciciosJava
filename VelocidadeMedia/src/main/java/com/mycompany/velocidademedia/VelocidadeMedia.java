/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velocidademedia;

import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class VelocidadeMedia {
    
    // Função para calcular a velocidade média de conexão de internet
    static void calcularVelocidadeMedia(String[] velocidades) {
        
        int total = 0;
        int count = 0;
        for (String v : velocidades){
            v = v.trim();
            count++;
            int vel = Integer.parseInt(v);
            total += vel;
            if(vel==0){
                System.out.println("Queda de Conexao");
                total = 0;
                count = 0;
                break;
            }
        }
        if (total != 0){
            System.out.println("Sem Quedas");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora: ");
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");
        
        // Calculando a velocidade média de conexão
        calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        
        scanner.close();
    }
}
