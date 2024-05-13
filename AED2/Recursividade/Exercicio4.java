// Escreva uma função recursiva que recebe um número inteiro e retorne o número de
// dígitos. Exemplo. N = 50 – saída deverá ser 2.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int digitos = contaDigitos(n);
        System.out.println("O numero de digitos de " + n + " é " + digitos);
    }

    public static int contaDigitos(int n) {
        return n < 10 ? 1 : 1 + contaDigitos(n / 10);
    }
}
