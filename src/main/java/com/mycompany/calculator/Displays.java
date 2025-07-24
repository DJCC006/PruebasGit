/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Displays {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        Procesos actuador = new Procesos();
        boolean status =true;
        
        System.out.println("----CALCULADORA JAVA----");
        System.out.println("");
       
        while(status==true){//Ciclo de continuidad de menu
            System.out.println("***OPCIONES***\n"
                +"Porfavor seleccione alguna de las siguientes opciones\n"
                +"1.Sumar\n"+"2.Restar\n"+"3.Multiplicar\n"+"4.Dividir\n"+"5.Potencia\n"+"6.Salir\n"+"");
            int opcion= lea.nextInt();
            int num1;
            int num2;
            double resultado;
            switch(opcion){
                case 1:
                    System.out.println("\n*Ha seleccionado la opcion de sumar*");
                    System.out.println("\nIngrese el primer numero: ");
                    num1= lea.nextInt();
                    System.out.println("\nIngrese el segundo numero: ");
                    num2=lea.nextInt();
                    resultado= actuador.Add(num1, num2);
                    System.out.println("\nLa suma de "+num1+" y "+num2+" es: "+resultado);
                    num1=0;
                    num2=0;
                    resultado=0;
                case 2:
                    System.out.println("\n*Ha seleccionado la opcion de resta: ");
                    System.out.println("\nIngrese el primer numero: ");
                    num1= lea.nextInt();
                    System.out.println("\nIngrese el segundo numero: ");
                    num2=lea.nextInt();
                    resultado=actuador.Subtract(num1, num2);
                    System.out.println("\nLa resta de "+num1+" y "+num2+" es: "+resultado);
                    num1=0;
                    num2=0;
                    resultado=0;
                case 3:
                    System.out.println("\n*Ha seleccionado la opcion de multiplicacion: ");
                    System.out.println("\nIngrese el primer numero: ");
                    num1= lea.nextInt();
                    System.out.println("\nIngrese el segundo numero: ");
                    num2=lea.nextInt();
                    resultado=actuador.Multiply(num1, num2);
                    System.out.println("\nLa multiplicacion de "+num1+" y "+num2+" es: "+resultado);
                    num1=0;
                    num2=0;
                    resultado=0;
                    
                case 4:
                    System.out.println("\n*Ha seleccionado la opcion de division: ");
                    System.out.println("\nIngrese el primer numero: ");
                    num1= lea.nextInt();
                    System.out.println("\nIngrese el segundo numero: ");
                    num2=lea.nextInt();
                    resultado=actuador.Division(num1, num2);
                    if(resultado!=0.0){
                        System.out.println("\nLa division de "+num1+" y "+num2+" es: "+resultado);
                    }else{
                        System.out.println("ERROR MATEMATICO");
                    }
                    
                    num1=0;
                    num2=0;
                    resultado=0;
                    
                case 5:
                    System.out.println("\n*Ha seleccionado la opcion de potencia: ");
                    System.out.println("\nIngrese el primer numero: ");
                    num1= lea.nextInt();
                    System.out.println("\nIngrese el numero de potencia: ");
                    num2=lea.nextInt();
                    resultado=actuador.Power(num1, num2);
                    System.out.println("\nLa potencia de "+num1+" a la "+num2+" es: "+resultado);
                    num1=0;
                    num2=0;
                    resultado=0;
                
                case 6:
                    status=false;
                    
                default:
                    System.out.println("Opcion incorrecta, porfavor ingrese una opcion valida");
            }
        }


        
        
        System.out.println("");
    }
}
