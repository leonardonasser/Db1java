package com.db1.do1start;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
     String texto;

      System.out.println("Digite o texto em maiusculo: ");
      texto=ler.next();

      texto = texto.toLowerCase();
        System.out.println("Em minusculo: "+texto);
        }


    }


