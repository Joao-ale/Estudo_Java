package com.dio;

import java.text.NumberFormat;
import java.util.Scanner;

public class Calculo_IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);//seto o máximo de casas decimais para 2

        System.out.println("Entre com seu peso(kg): ");
        float peso = scan.nextFloat();

        System.out.println("Entre com sua altura(m): ");
        float altura = scan.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa de magreza do IMC");
        } else if (18.5 <= imc && imc < 25){
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa normal do IMC");
        } else if (25 <= imc && imc < 30) {
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa de sobrepeso do IMC");
        } else if (30 <= imc && imc < 35) {
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa de obesidade grau 1 do IMC");
        } else if (35 <= imc && imc < 40) {
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa de obesidade grau 2 do IMC");
        } else if (imc >= 40) {
            System.out.println("Seu IMC é de " + nf.format(imc) + ", você está na faixa de obesidade grau 3 do IMC");
        }
    }
}
