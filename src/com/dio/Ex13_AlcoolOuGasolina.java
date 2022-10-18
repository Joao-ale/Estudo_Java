package com.dio;

import java.util.Scanner;

public class Ex13_AlcoolOuGasolina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço do Álcool: R$");
        float alcool = scan.nextFloat();

        System.out.println("Entre com o preço da Gasolina: R$");
        float gasolina = scan.nextFloat();

        float diferencaPreco = gasolina / alcool;

        if (diferencaPreco < 0.7){
            System.out.println("O combustível mais custo benefício é o álcool");
        }
        else {
            System.out.println("O combustível mais custo benefício é a gasolina");
        }
    }
}
