// Escreva uma função recursiva que calcule o n-ésimo termo de uma progressão
// geométrica onde o primeiro termo e a razão são informados pelo usuário.
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro termo da progressão geométrica: ");
        int a = sc.nextInt();
        System.out.println("Digite a razão da progressão geométrica: ");
        int r = sc.nextInt();
        System.out.println("Digite o n-ésimo termo da progressão geométrica: ");
        int n = sc.nextInt();
        int termo = termoProgressaoGeometrica(a, r, n);
        System.out.println("O " + n + "º termo da progressão geométrica é " + termo);
    }

    public static int termoProgressaoGeometrica(int a, int r, int n) {
        return n == 1 ? a : r * termoProgressaoGeometrica(a, r, n - 1);
    }
}
