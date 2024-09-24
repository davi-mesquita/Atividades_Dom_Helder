package Atividade4.src.model;

import java.io.Serializable;

public class Pessoa implements Serializable {
  private static final long serialVersionUID = 1L;
  private static int idCounter = 0;
  private int id;
  private String nome;

  public Pessoa(String nome) {
    this.id = ++idCounter;
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Pessoa [Id=" + id + ", Nome=" + nome + "]";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
