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
public class BolsaFilhos {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe quantos filhos de 0 a 3 anos:");
    Integer qtdFilhos0a3Anos = scan.nextInt();

    System.out.println("Informe quantos filhos de 4 a 16 anos:");
    Integer qtdFilhos4a16anos = scan.nextInt();

    System.out.println("Informe quantos filhos de 17 a 18 anos:");
    Integer qtdFilhos17a18anos = scan.nextInt();

    Double valorBolsaFilhosMenos4anos = 25.12;
    Double valorBolsaFilhos4a16anos = 15.88;
    Double valorBolsaFilhos17a18anos = 12.44;

    Integer qtdTotalFilhos =
            qtdFilhos0a3Anos + qtdFilhos4a16anos + qtdFilhos17a18anos;
    Double valorTotalBolsaQtdFilhos0a3Anos =
            qtdFilhos0a3Anos * valorBolsaFilhosMenos4anos;
    Double valorTotalBolsaQtdFilhos4a16Anos =
            qtdFilhos4a16anos * valorBolsaFilhos4a16anos;
    Double valorTotalBolsaQtdFilhos7a18Anos =
            qtdFilhos17a18anos * valorBolsaFilhos17a18anos;

    Double somaTotalBolsaTodosFIlhos =
            valorTotalBolsaQtdFilhos0a3Anos + valorTotalBolsaQtdFilhos4a16Anos +
            valorTotalBolsaQtdFilhos7a18Anos;

    String frase = String.format(
            "Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
            qtdTotalFilhos, somaTotalBolsaTodosFIlhos);
    
    System.out.println(frase);
  }
}
