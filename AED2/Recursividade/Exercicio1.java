//Escreva uma função recursiva que recebe um vetor de comprimento N e o
// imprime na tela na ordem inversa de entrada

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        imprimeVetorInverso(vetor, n);
    }

    public static void imprimeVetorInverso(int[] vetor, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(vetor[n - 1] + " ");
        imprimeVetorInverso(vetor, n - 1);
    }
}
