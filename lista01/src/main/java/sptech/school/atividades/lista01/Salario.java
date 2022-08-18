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
public class Salario {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o salario bruto:");
    Double salarioBruto = scan.nextDouble();

    Double descontoINSS = salarioBruto * 0.1;
    Double descontoIR = salarioBruto * 0.2;

    System.out.println(
            "Informe a condução diária de ida da casa para o trabalho:");
    Double conducaoDiariaIda = scan.nextDouble();

    Double valorVT = conducaoDiariaIda * 2;
    Double valorTotalDescontos = descontoINSS + descontoIR + valorVT;

    Double salarioLiquido = salarioBruto - valorTotalDescontos;

    System.out.printf(
            "Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f",
            salarioBruto, valorTotalDescontos, salarioLiquido);
  }
}
