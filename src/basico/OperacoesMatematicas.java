/* 
    Descrição: Crie um programa que receba dois números e pergunte ao usuário qual operação deseja realizar (soma, subtração, multiplicação ou divisão). Mostre o resultado.
    Objetivo: Trabalhar com Scanner, condicionais e operadores matemáticos. 
*/

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar os números ao usuário
        System.out.print("Digite o número X: ");
        int x = sc.nextInt();
        System.out.print("Digite o número Y: ");
        int y = sc.nextInt();

        System.out.println();
        sc.nextLine(); // Consumir a quebra de linha pendente

        // Solicitar a operação
        System.out.println("Escolha a operação:");
        System.out.println("soma (som), subtração (sub), multiplicação (mult) ou divisão (div)");
        System.out.print("Digite sua escolha: ");
        String opr = sc.nextLine().toLowerCase(); // Converter para minúsculas

        int result = 0;
        boolean operacaoValida = true;

        // Executar a operação escolhida
        switch (opr) {
            case "som":
                result = x + y;
                break;
            case "sub":
                result = x - y;
                break;
            case "mult":
                result = x * y;
                break;
            case "div":
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida! Por favor, tente novamente.");
                operacaoValida = false;
        }

        // Exibir o resultado se a operação for válida
        if (operacaoValida) {
            System.out.println("Resultado: " + result);
        }

        sc.close(); // Fechar o Scanner
    }
}
