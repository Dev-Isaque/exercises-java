/* 
    Descrição: Solicite um número ao usuário e exiba a tabuada de
    multiplicação desse número de 1 a 10.
    Objetivo: Praticar loops (for ou while). 
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TABUADA");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int result;

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }

        sc.close();
    }
}
