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
public class Idade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Qual é o seu nome?");
    String nome = scan.nextLine();
    System.out.println("");
    
    System.out.println("");
    System.out.printf("Ola %s!, Qual o ano de seu nascimento?", nome);
    Integer anoNascimentoUsuario = scan.nextInt();
    System.out.println("");
    
    Integer idadePrevistaPara2030 = 2030 - anoNascimentoUsuario;
    
    System.out.printf("Em 2030 você terá %d anos.", idadePrevistaPara2030);
  }
}
