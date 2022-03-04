package com.dio;

import java.util.Scanner;

public class Ex4_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros, numero, count = 0;
        int quantPar = 0, quantImpar = 0;

        System.out.println("Quantos números deseja inserir? ");
        quantidadeNumeros = scan.nextInt();
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;
            else quantImpar++;

            count ++;
        }while (count < quantidadeNumeros);

        System.out.println("Números pares: " + quantPar);
        System.out.println("Números impares: " + quantImpar);

    }
}
