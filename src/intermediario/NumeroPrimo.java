/* 
    Descrição: Faça um programa que verifique se um número fornecido pelo
    usuário é primo.
    Objetivo: Praticar loops e lógica condicional
*/

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int num = sc.nextInt();

        if (ehPrimo(num)) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        sc.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false; 
        }
        if (num == 2) {
            return true; 
        }
        if (num % 2 == 0) {
            return false; 
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
