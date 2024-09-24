package Atividade4.src.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import Atividade4.src.model.Pessoa;

public class WriterPessoa {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);
        FileOutputStream fileOut = new FileOutputStream("./Atividade4/data/person.dat");
        ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

      Pessoa p1 = new Pessoa("João");
      Pessoa p2 = new Pessoa("Maria");

      objOut.writeObject(p1);
      objOut.writeObject(p2);

      while (true) {
        System.out.println("Qual seu nome? (caso queira sair, digite 'sair')");
        String nome = sc.nextLine();
        if (nome.equalsIgnoreCase("sair")) {
          break;
        }
        Pessoa p = new Pessoa(nome);
        objOut.writeObject(p);
      }

      System.out.println("Objetos gravados com sucesso no arquivo person.dat");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
