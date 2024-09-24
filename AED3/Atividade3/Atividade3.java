package Atividade3;

import java.util.Scanner;
import java.io.*;

public class Atividade3 {
  public static void main(String[] args) {
    int telefone = -1;
    String nome = "";
    Scanner sc = new Scanner(System.in);
    String currentDirectory = System.getProperty("user.dir");
    String filePath = currentDirectory + File.separator + "agenda.txt";
    try {
      while (telefone != 0) {
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o telefone: ");
        telefone = sc.nextInt();

        sc.nextLine();

        FileWriter fw = new FileWriter(filePath, true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(nome + ": " + telefone);
        bw.newLine();
        bw.close();
        fw.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    sc.close();
  }
}
