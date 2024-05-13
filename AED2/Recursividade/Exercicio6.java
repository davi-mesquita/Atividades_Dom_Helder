// Escreva uma função recursiva que retorne o resultado da multiplicação dos dois
// parâmetros utilizando apenas o operador somas.

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = sc.nextInt();
        int resultado = multiplica(a, b);
        System.out.println("O resultado da multiplicação de " + a + " por " + b + " é " + resultado);
    }
    public static int multiplica(int a, int b) {
        return b == 0 ? 0 : a + multiplica(a, b - 1);
    }
}
