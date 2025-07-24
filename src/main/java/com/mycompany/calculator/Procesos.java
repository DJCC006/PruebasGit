/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author David
 */
public class Procesos {
    
    
    //Proceso suma
    public int Add(int num1, int num2){
        int resultado= num1+num2;
        return resultado;
    }
    
    
    //Proceso resta
    public int Subtract(int num1, int num2){
        int resultado= num1-num2;
        return resultado;
    }
    
    
    //Proceso multiplicacion
    public int Multiply(int num1, int num2){
        int resultado = num1*num2;
        return resultado;
    }
    
    //Proceso division
    
    public double Division(int num1, int num2){
        double resultado=0;
        try{
            double div= (num1/num2);
            resultado=div;
        }catch(ArithmeticException e){
            return 0.0;
        }
        return resultado;
    }

    
    //Proceso potencia
    public int Power(int num1, int pow){
        int resultado=num1;
        int num=num1;
        for(int i=0; i<=pow; i++){
            int temp= resultado*num1;
            resultado=temp;
        }
        return resultado;
    }
    
    
}
