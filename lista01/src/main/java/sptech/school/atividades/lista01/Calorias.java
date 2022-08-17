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
public class Calorias {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe seu nome:");
    String nome = scan.nextLine();

    System.out.println("Informe o tempo de aquecimento(minutos):");
    Integer tempoAquecimento = scan.nextInt();

    System.out.println("Informe o tempo em de exercicios aerobicos(minutos):");
    Integer tempoExerciciosAerobicos = scan.nextInt();

    System.out.println("Informe o tempo de musculacao(minutos):");
    Integer tempoMusculacao = scan.nextInt();

    Integer perdaCaloriasAquecimentoMinuto = tempoAquecimento * 12;
    Integer perdaCaloriasExerciciosAerobicosMinuto =
            tempoExerciciosAerobicos * 20;
    Integer perdaCaloriasMusculacaoMinuto = tempoMusculacao * 25;

    Integer totalMinutosExercicios =
            tempoAquecimento + tempoExerciciosAerobicos + tempoMusculacao;
    
    Integer totalPerdaCalorias =
            perdaCaloriasAquecimentoMinuto + perdaCaloriasExerciciosAerobicosMinuto + perdaCaloriasMusculacaoMinuto;

    String frase = String.format(
            "Olá, %s. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias",
            nome, totalMinutosExercicios, totalPerdaCalorias);
    
    System.out.println(frase);
  }
}
