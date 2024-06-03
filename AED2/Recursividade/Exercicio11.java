//  Dada a notação implemente uma função recursiva em JAVA t(o) = 1; t(1) = 2; t(n) = t(n-1) * t(n-2) - t(n-1).

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();
        int resultado = funcaoRecursiva(n);
        System.out.println("O resultado da função recursiva para n = " + n + " é " + resultado);
    }

    public static int funcaoRecursiva(int n) {
        if (n == 1) {
            return 2;
        }else if (n == 0) {
            return 1;
        }else{
            return funcaoRecursiva(n - 1) * (funcaoRecursiva(n - 2)) - funcaoRecursiva(n - 1);
        }
    }
}
