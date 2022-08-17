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
public class CadastroUsuario {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o nome de usuario:");
    String usuario = scan.nextLine();

    System.out.println("Informe sua senha:");
    String senha = scan.nextLine();

    System.out.println("Informe a quantidade de tentivas da senha");
    Integer tentativasSenha = scan.nextInt();

    String frase = String.format(
            "Seu login é %s e sua senha é %s. Você tem %d tentavias antes de ser bloqueado",
            usuario, senha, tentativasSenha);

    System.out.println(frase);
  }
}
