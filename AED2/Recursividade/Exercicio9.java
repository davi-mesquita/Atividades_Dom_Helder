// Crie uma função recursiva na linguagem JAVA que recebe como parâmetro um
// número e seu expoente e calcule a potência desse número a esse expoente.

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();
        int potencia = calculaPotencia(x, n);
        System.out.println("O valor de " + x + " elevado a " + n + " é " + potencia);
    }

    public static int calculaPotencia(int x, int n) {
        return n == 0 ? 1 : x * calculaPotencia(x, n - 1);
    }
}
