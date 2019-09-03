package com.unama;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCopia;
        System.out.println("Informe o total de cópias: ");
        totalCopia = sc.nextInt();
        double totalPago;
        if (totalCopia <= 100) {
            totalPago = totalCopia*0.25;
        }else{
             totalPago = totalCopia*0.20;
        }
            System.out.println("Total a ser pago" + totalPago);
    }
}
