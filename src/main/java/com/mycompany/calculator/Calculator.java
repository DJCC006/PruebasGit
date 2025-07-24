/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;
/**
 *
 * @author David
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        System.out.println("Ingrese primer numero");
        int num1= lea.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = lea.nextInt();
        
        int res=num1/num2;
        System.out.println(res);
        
    }
}
