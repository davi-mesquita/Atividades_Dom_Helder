// Escreva uma função recursiva que recebe um número inteiro e retorne a soma dos
// seus dígitos. Exemplo = N = 45. Saída deverá ser 9.

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int digitos = somaDigitos(n);
        System.out.println("A soma dos digitos é " + digitos);
    }

    public static int somaDigitos(int n) {
        return n < 10 ? n : n % 10 + somaDigitos(n / 10);
    }
}
