/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoquatrooperacoes;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class ProjetoQuatroOperacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        System.out.print("Digite x:");
        x = sc.nextDouble();

        System.out.print("Digite y:");
        y = sc.nextDouble();

        double resultadoSoma = x + y;
        double resultadoSubtracao = x - y;
        double resultadoMultiplicacao = x * y;
        double resultadoDivisao = x / y;

        if (y != 0) {

        } else {

        }

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);

        // TODO code application logic here
    }

}
