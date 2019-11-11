package com.db1.do1start;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor1, valor2;

        System.out.println("Digite o numero 1: ");
        valor1 = ler.nextInt();

        System.out.println("Digite o numero 2: ");
        valor2 = ler.nextInt();

        if (valor1 < valor2) {
            System.out.println("Menor valor é o 1: " + valor1);
        } else {
            System.out.println("Menor valor é o 2: " + valor2);
        }
    }
}




