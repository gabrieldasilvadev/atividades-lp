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
public class CalculoMedia {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o seu nome:");
    String nome = scan.nextLine();

    System.out.println("Informe a sua primeira nota:");
    Double nota1 = scan.nextDouble();

    System.out.println("Informe a sua segunda nota:");
    Double nota2 = scan.nextDouble();
    
    Double mediaNotas = (nota1 + nota2) / 2;
    
    System.out.printf("Olá, %s. Sua média foi de %.1f", nome, mediaNotas);
  }
}
