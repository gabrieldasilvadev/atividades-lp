/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.atividades.lista01;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Calculadora {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o primeiro numero:");
    Double numero1 = scan.nextDouble();

    System.out.println("Informe o segundo numero:");
    Double numero2 = scan.nextDouble();

    Double soma = numero1 + numero2;
    Double subtracao = numero1 - numero2;
    Double multiplicacao = numero1 * numero2;
    Double divisao = numero1 / numero2;

    System.out.println("");
    System.out.println("Resultado da soma:");
    System.out.println("");
    System.out.println(soma);
    System.out.println("");

    System.out.println("Resultado da subtração:");
    System.out.println("");
    System.out.println(subtracao);
    System.out.println("");

    System.out.println("Resultado da multiplicação:");
    System.out.println("");
    System.out.println(multiplicacao);
    System.out.println("");

    System.out.println("Resultado da divisção:");
    System.out.println("");
    System.out.println(divisao);
    System.out.println("");
  }
}
