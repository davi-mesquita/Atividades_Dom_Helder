package Atividade1;

import java.util.Scanner;
import java.io.*;

public class Atividade1 {
  public static void main(String[] args) {
    int listaInteiros[] = new int[10];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
      System.out.println("Digite um número inteiro: ");
      listaInteiros[i] = sc.nextInt();
    }
    sc.close();
    try {
      FileWriter fw = new FileWriter("arquivo.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      for (int i = 0; i < 10; i++) {
        bw.write(Integer.toBinaryString(listaInteiros[i]));
        bw.newLine();
      }
      bw.close();
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
