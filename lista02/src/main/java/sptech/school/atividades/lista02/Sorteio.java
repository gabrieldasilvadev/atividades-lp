/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package sptech.school.atividades.lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gabriel
 */
public class Sorteio {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um numero de 1 a 100");
    Integer numero = scan.nextInt();

    Integer numerosParesSorteados = 0;
    Integer numerosImparesSorteados = 0;
    Integer numeroSorteado = null;

    if (numero > 100) {
      System.out.println("O numero deve estar em um range de 1 a 100!");
    } else {
      for (int i = 1; i <= 200; i++) {
        numeroSorteado = ThreadLocalRandom.current().nextInt(1, 100);
        if (numeroSorteado % 2 == 0) {
          numerosParesSorteados++;
        } else if (numeroSorteado % 2 >= 1) {
          numerosImparesSorteados++;
        }
      }

      if (numero.equals(numeroSorteado)) {
        System.out.println("Seu numero foi sorteado: " + numeroSorteado);
      }
      System.out.println("Numeros pares sorteados: " + numerosParesSorteados);
      System.out.
              println("Numeros impares sorteados: " + numerosImparesSorteados);
    }
  }
}
