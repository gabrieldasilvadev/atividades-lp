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
public class CalculadoraTroco {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Informe o valor unitario do produto:");
    Double valorUnitarioProduto = scan.nextDouble();
    
    System.out.println("Informe a quantidade vendida:");
    Integer qtdVendida = scan.nextInt();
    
    System.out.println("Informe o valor pago:");
    Double valorPago = scan.nextDouble();
    
    Double valorTotalCompraProduto = valorUnitarioProduto * qtdVendida;
    Double trocoParaCliente = valorPago - valorTotalCompraProduto;
        
    if(trocoParaCliente <= 0) {
      System.out.println("Seu troco será de R$ 0.");
    } else {
      System.out.printf("Seu troco será de R$ %.2f", trocoParaCliente);
    }
  }
}
