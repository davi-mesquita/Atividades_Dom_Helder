// Construa uma função recursiva na linguagem JAVA que recebe por parâmetro um
// vetor de inteiros e retorne o elemento de menor valor
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        int menor = menorElemento(vetor, n);
        System.out.println("O menor elemento do vetor é " + menor);
    }

    public static int menorElemento(int[] vetor, int n) {
        if (n == 1) {
            return vetor[0];
        }
        int menor = menorElemento(vetor, n - 1);
        return vetor[n - 1] < menor ? vetor[n - 1] : menor;
    }
}
