/* 
    Descrição: Solicite ao usuário 5 notas, calcule a média e informe se o aluno
    foi aprovado (nota >= 7) ou reprovado.
    Objetivo: Trabalhar com arrays, loops e condições 
*/

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo da média das notas");

        System.out.print("Nota Língua Portuguesa: ");
        double pot = sc.nextDouble();

        System.out.print("Nota Matemática: ");
        double mat = sc.nextDouble();

        System.out.print("Nota História: ");
        double his = sc.nextDouble();

        System.out.print("Nota Geografia: ");
        double geo = sc.nextDouble();

        System.out.print("Nota Ciências: ");
        double cie = sc.nextDouble();

        double[] notas = { pot, mat, his, geo, cie };

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("\nNotas individuais:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", (i + 1), notas[i]);
        }

        System.out.printf("\nMédia final: %.2f\n", media);
        if (media >= 7) {
            System.out.println("Resultado: APROVADO");
        } else {
            System.out.println("Resultado: REPROVADO");
        }

        sc.close();
    }
}
