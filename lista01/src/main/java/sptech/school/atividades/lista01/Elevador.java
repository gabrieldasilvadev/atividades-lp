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
public class Elevador {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o limite de peso do elevador:");
    Double limitePesoElevador = scan.nextDouble();

    System.out.println("Informe o limite de pessoas do elevador");
    Integer limitePessoasElevador = scan.nextInt();

    Double pesoTotalPessoasNoElevador = 0.0;
    Integer i = 0;

    for (; i < limitePessoasElevador; i++) {
      System.out.printf("Informe o peso da %dª pessoa \n", i + 1);
      Double pesoPessoa = scan.nextDouble();

      pesoTotalPessoasNoElevador += pesoPessoa;
    }

    System.out.printf(
            "Entraram %d pessoas no elevador, no qual cabem %d pessoas.\n" +
            "O peso total no elevador é de %.2f, sendo que ele suporta %.2f", i,
            limitePessoasElevador, pesoTotalPessoasNoElevador,
            limitePesoElevador);
  }
}
