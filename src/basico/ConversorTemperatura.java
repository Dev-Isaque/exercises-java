/* 
    Descrição: Faça um programa que converta uma temperatura de Celsius para Fahrenheit e vice-versa.
    Objetivo: Trabalhar com lógica e fórmulas matemáticas.
 */

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar a escolha do usuário
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int escolha = sc.nextInt();

        // Variável para armazenar a temperatura
        double temperatura, resultado;

        if (escolha == 1) {
            // Conversão de Celsius para Fahrenheit
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura * 9 / 5) + 32;
            System.out.printf("%.2f°C é igual a %.2f°F\n", temperatura, resultado);
        } else if (escolha == 2) {
            // Conversão de Fahrenheit para Celsius
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperatura = sc.nextDouble();
            resultado = (temperatura - 32) * 5 / 9;
            System.out.printf("%.2f°F é igual a %.2f°C\n", temperatura, resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        // Fechar o scanner
        sc.close();
    }
}
