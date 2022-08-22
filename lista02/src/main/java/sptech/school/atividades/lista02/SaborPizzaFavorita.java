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
public class SaborPizzaFavorita {

  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);
    Integer opcao = null;

    Integer pizzaSaborMussarela = 0;
    Integer pizzaSaborCalabresa = 0;
    Integer pizzaSaborQuatroQueijos = 0;
    int alunos = 0;

    do {
      System.out.println("");

      exibirMenu();

      System.out.println("");
      System.out.println("Vote em um sabor de pizza: ");
      opcao = scan.nextInt();

      if (!opcao.equals(5) && !opcao.equals(25) && !opcao.equals(50)) {
        throw new Exception("Insira uma opção de voto valida!");
      }

      switch (opcao) {
        case 5: pizzaSaborMussarela++;
          break;
        case 25: pizzaSaborCalabresa++;
          break;
        case 50: pizzaSaborQuatroQueijos++;
          break;
      }

      alunos++;

    } while (alunos < 10);

    System.out.println(
            "Quantidade de votos do sabor de Mussarela: " + pizzaSaborMussarela);
    System.out.println(
            "Quantidade de votos do sabor de Calabresa: " + pizzaSaborCalabresa);
    System.out.println(
            "Quantidade de votos do sabor de Quatro Queijos: " + pizzaSaborQuatroQueijos);

    System.out.println("");

    if (pizzaSaborMussarela > pizzaSaborCalabresa && pizzaSaborMussarela > pizzaSaborQuatroQueijos) {
      System.out.println("Sabor Mussarela é a favorita!");
    } else if (pizzaSaborCalabresa > pizzaSaborMussarela && pizzaSaborCalabresa > pizzaSaborQuatroQueijos) {
      System.out.println("Sabor Calabresa é a favorita!");
    } else {
      System.out.println("Sabor Quatro queijos é a favorita!");
    }

  }

  private static void exibirMenu() {
    System.out.println("5 - Pizza de Mussarela");
    System.out.println("25 - Pizza de Calabresa");
    System.out.println("50 - Pizza de Quatro queijos");
  }
}
