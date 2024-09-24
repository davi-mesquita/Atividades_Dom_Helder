package Atividade4.src.io;

import java.io.*;
import Atividade4.src.model.Pessoa;

public class ReadPessoa {
  public static void main(String[] args) {
    File file = new File("./Atividade4/data/person.dat");

    if (!file.exists()) {
      System.out.println("Arquivo não encontrado: " + file.getAbsolutePath());
      return;
    }

    try (FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis)) {

      while (true) {
        try {
          Pessoa p = (Pessoa) ois.readObject();
          System.out.println(p);
        } catch (EOFException e) {
          System.out.println("Fim do arquivo alcançado.");
          break;
        }
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
