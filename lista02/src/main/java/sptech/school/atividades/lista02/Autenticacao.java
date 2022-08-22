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
public class Autenticacao {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe seu nome:");
    String nome = scan.nextLine();

    System.out.println("Informe sua senha");
    String senha = scan.nextLine();

    while (!nome.equals("admin") || !senha.equals("#SPtech2022")) {

      if (!nome.equals("admin") && !senha.equals("#SPtech2022")) {
        System.out.println("Login e/ou senha inválidos”");
        System.out.println("Informe seu nome:");
        nome = scan.nextLine();

        System.out.println("Informe sua senha");
        senha = scan.nextLine();
      } else if (!nome.equals("admin")) {
        System.out.println("Login inválido");

        System.out.println("Informe seu nome:");

        nome = scan.nextLine();
      } else if (!senha.equals("#SPtech2022")) {
        System.out.println("Senha inválida");

        System.out.println("Informe sua senha");
        senha = scan.nextLine();
      }

      System.out.println("Login realizado com sucesso");
    }
  }
}
