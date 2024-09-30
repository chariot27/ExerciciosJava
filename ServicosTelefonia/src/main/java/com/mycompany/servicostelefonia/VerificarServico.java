/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicostelefonia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class VerificarServico {
    public void Verificar() {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        System.out.println("Entrada do serviço a ser verificado: ");
        String servico = scanner.nextLine().trim();
        
        System.out.println("Entrada do nome do cliente e os serviços contratados: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        for(int i = 1;!partes.equals("");i++){
            String percorrer = partes[i];
            if (percorrer.equals(servico)){
                contratado = true;
                System.out.println("Sim é contratado: "+contratado);
                break;
            }else{
                System.out.println("Não é contratado: "+contratado);
            }
        }
        
        scanner.close();
    } 
}
