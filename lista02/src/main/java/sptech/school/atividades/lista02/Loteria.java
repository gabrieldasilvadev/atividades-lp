/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.school.atividades.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gabriel
 */
public class Loteria {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 20);
    Integer numero = null;

    do {
      System.out.println("Informe um numero de 0 a 10: ");
      numero = scan.nextInt();
      if (numero > 10) {
        System.out.println("O numero deve estar no range de 0 a 10");
      }
    } while (!numero.equals(numeroAleatorio));

    switch ((numeroAleatorio >= 0 && numeroAleatorio <= 3) ? 0 :
            (numeroAleatorio >= 4 && numeroAleatorio <= 9) ? 1 : 2) {
      case 0:
        System.out.println("Você é MUITO sortudo");
        break;
      case 1:
        System.out.println("Você é sortudo");
        break;
      case 2:
        System.out.println("É melhor você parar de apostar e ir trabalhar");
        break;
    }
  }
}
