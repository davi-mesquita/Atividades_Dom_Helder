// Escreva uma função recursiva divide(A,B) para calcular a divisão inteira de A por B
// utilizando apenas subtrações.


import java.util.Scanner;

public class Exercicio3 {
      public static void main(String[] args) {
        int dividendo,divisor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();

        int quociente = divide(dividendo, divisor);
        System.out.println("O quociente da divisão de " + dividendo + " por " + divisor + " é " + quociente);    
      }
      public static int divide(int dividendo, int divisor) {
        return dividendo < divisor ? 0 : 1 + divide(dividendo - divisor, divisor);
      }
}
