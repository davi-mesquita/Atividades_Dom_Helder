// Escreva uma função recursiva que recebe um vetor como parâmetro e um valor k.
// Se o valor k exista no vetor, a função deverá retornar a sua posição, senão deverá
// retornar -1.

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        System.out.println("Digite o valor de k: ");
        int k = sc.nextInt();
        int posicao = buscaValor(vetor, k, 0, n);
        System.out.println("O valor " + k + " está na posição " + posicao);
    }

    public static int buscaValor(int[] vetor, int k, int i, int n) {
        if (i == n) {
            return -1;
        }
        if (vetor[i] == k) {
            return i;
        }
        return buscaValor(vetor, k, i + 1, n);
    }
}
