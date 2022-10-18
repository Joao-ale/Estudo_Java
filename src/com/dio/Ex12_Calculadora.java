package com.dio;

import java.util.Scanner;

public class Ex12_Calculadora {

    public static void main(String[] args) {
        /*POSSIBILITA A ENTRADA DE DADOS*/
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        int a = scan.nextInt();

        System.out.println("Entre com o segundo número: ");
        int b = scan.nextInt();

        float resultado;

        System.out.println("Qual operação deseja realizar? \n1 - SOMA \n2 - SUBTRAÇÃO \n3 - MULTIPLICAÇÃO \n4 - DIVISÃO \n5 - CANCELAR");
        int operacao = scan.nextInt();

        switch (operacao){
            case 1:
                resultado = a + b;
                System.out.println(a + " + " + b + " = " + resultado);
                break;
            case 2:
                resultado = a - b;
                System.out.println(a + " - " + b + " = " + resultado);
                break;
            case 3:
                resultado = a * b;
                System.out.println(a + " * " + b + " = " + resultado);
                break;
            case 4:
                resultado = a / b;
                System.out.println(a + " / " + b + " = " + resultado);
                break;
            case 5:
                System.out.println("Programa encerrado!");
                break;
            default:
                System.out.println("Número digitado inválido!");
        }
    }
}
