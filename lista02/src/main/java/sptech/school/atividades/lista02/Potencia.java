/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.atividades.lista02;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Potencia {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a base: ");
    Integer base = scan.nextInt();

    System.out.println("Informe o expoente: ");
    Integer expoente = scan.nextInt();

    Integer resultado = 1;

    for (int i = expoente; i >= 1; i--) {
      resultado *= base;
    }

    System.out.println("Resultado: " + resultado);
  }

}
