/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tempconversor;

import java.util.Scanner;

/**
 *
 * @author maxta
 */
public class Temperaturas {
    
    void Rankine(float celsiusNum){
        float raNum = (float) (celsiusNum * 1.8 + 32 + 459.67);
        System.out.println("A conversão de "+celsiusNum+" celsius para rankine é "+raNum+"RA");
    }
    
    void Reaumur(float celsiusNum){
        float reNum = (float) (celsiusNum * 0.8);
        System.out.println("A conversão de "+celsiusNum+" celsius para reaumur é "+reNum+"RE");
    }
    
    void Kelvin(float celsiusNum){
        float kNum = (float) (celsiusNum + 273.15);
        System.out.println("A conversão de "+celsiusNum+" celsius para kelvin é "+kNum+"K");
    }
    
    void Fahrenheit(float celsiusNum){
        float fNum = (float) (celsiusNum * 1.8 + 32);
        System.out.println("A conversão de "+celsiusNum+" celsius para fahrenheit é "+fNum+"F");
    }
    
    void Conversao(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número em celsius: ");
        float celsiusNum = sc.nextFloat();
        
        Fahrenheit(celsiusNum);
        Kelvin(celsiusNum);
        Reaumur(celsiusNum);
        Rankine(celsiusNum);
    }
    
}
