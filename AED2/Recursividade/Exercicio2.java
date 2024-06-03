//Escreva uma função recursiva que recebe um vetor de comprimento N e o escreve em
//um arquivo (saida.txt) na ordem inversa de entrada.
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Exercicio2 {
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
                String fileName = "saida.txt";

        String userHomeDir = System.getProperty("user.home");

        String filePath = userHomeDir + File.separator + "Downloads" + File.separator + fileName;

        try {
            //JOGAR O ARQUIVO PARA A PASTA DOWNLOADS
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(vetor[n - 1] + " ");
            writer.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo");
        }
        imprimeVetorInverso(vetor, n - 1);
    }
}