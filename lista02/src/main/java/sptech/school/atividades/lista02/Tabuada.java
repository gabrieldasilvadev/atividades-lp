/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package sptech.school.atividades.lista02;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Tabuada {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira um numero:");
    Integer numero = scan.nextInt();

    System.out.println("Tabuada do: " + numero);

    for (int i = 0; i <= 10; i++) {
      Integer multiplos = i * 2;
      System.out.printf("2 X %d = %d \n", i, multiplos);
    }
  }
}
