package com.db1.do1start;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor1, valor2,valor3;

        System.out.println("Digite o num 1: ");
        valor1 = ler.nextInt();

        System.out.println("Digite o numero 2: ");
        valor2 = ler.nextInt();

        System.out.println("Digite o numero 3: ");
        valor3 = ler.nextInt();

        if (valor1<valor2 && valor1<valor3) {
            System.out.println("Menor valor é o 1: " + valor1);
        }
//=============
        if (valor2<valor1 && valor2<valor3){
            System.out.println("Menor valor é o 2: " + valor2);
        }
//==============
        if (valor3<valor1 && valor3<valor2){
            System.out.println("Menor valor é o 3: " + valor3);
        }

    }
}




