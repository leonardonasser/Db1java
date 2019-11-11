package com.db1.do1start;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
      Integer numero1,numero2,resultado;


      System.out.println("Digite o numero 1: ");
      numero1=ler.nextInt();

      System.out.println("Digite o numero 2: ");
      numero2=ler.nextInt();

        resultado=numero1+numero2;
        System.out.println("Resultado: "+resultado);
        }


    }


