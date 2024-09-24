package Atividade2;

import java.util.Scanner;
import java.io.*;

public class Atividade2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String currentDirectory = System.getProperty("user.dir");
    String filePath = currentDirectory + File.separator + "profissoes.txt";

    try {
      FileWriter fw = new FileWriter(filePath);
      BufferedWriter bw = new BufferedWriter(fw);

      for (int i = 0; i < 3; i++) {
        System.out.println("Digite sua Profissão: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu tempo de serviço: ");
        float tempo = sc.nextFloat();

        sc.nextLine();

        bw.write(nome + ": " + tempo + " anos");
        bw.newLine();
      }
      sc.close();
      bw.close();
      fw.close();
      System.out.println("Informações gravadas em '" + filePath + "' com sucesso.");

    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileReader fr = new FileReader(filePath);
      BufferedReader br = new BufferedReader(fr);

      String linha = br.readLine();
      while (linha != null) {
        System.out.println(linha);
        linha = br.readLine();
      }
      br.close();
      fr.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
