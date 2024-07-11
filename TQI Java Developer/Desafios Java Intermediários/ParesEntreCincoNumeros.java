/*
    Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

    Entrada
    O arquivo de entrada contém 5 valores inteiros quaisquer.

    Saída
    Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

    Exemplo de Entrada	                Exemplo de Saída
            7
            -5                          3 valores pares
            6
            -4
            12
*/

import java.util.Scanner;

public class Problem {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantidadePares = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            
            if (n % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.printf("%d valores pares\n", quantidadePares);
    }
}