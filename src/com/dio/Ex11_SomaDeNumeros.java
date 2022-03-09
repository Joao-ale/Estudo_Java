package com.dio;

import java.util.Scanner;

public class Ex11_SomaDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int numero1 = scan.nextInt();
        System.out.print("Entre com um número: ");
        int numero2 = scan.nextInt();

        System.out.println("A soma dos números é: " + (numero1 + numero2));
    }
}