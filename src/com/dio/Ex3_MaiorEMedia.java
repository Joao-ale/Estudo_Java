package com.dio;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, maior = 0, cout = 0;
        float media = 0;


        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior){
                maior = numero;
            }
            media += numero;
            cout += 1;
        } while (cout < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + (media/5));
    }
}
