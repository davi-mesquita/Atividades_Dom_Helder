import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class main {

    public static void main(String[] args) {
    int x = 0; 
        while (x != 6) {      
            System.out.println("1. Cadastrar Nome e Telefone: ");
            System.out.println("2. Exibir Lista de Contatos: ");
            System.out.println("3. Busca por Nome: ");
            System.out.println("4. Remoção de Contato: ");
            System.out.println("5. Atualizar Arquivo txt: ");
            System.out.println("6. Sair do Programa: ");  
            x = Integer.parseInt(System.console().readLine());
            switch (x) {
                case 1:
                    if(CarregarDados()){
                        System.out.println("Dados carregados com sucesso!");
                    }else{
                        System.out.println("Erro ao carregar dados!");
                    }
                    break;
                case 2:
                    if(ExibeLista()){
                        System.out.println("Lista exibida com sucesso!");
                    }else{
                        System.out.println("Erro ao exibir lista!");
                    }
                    break;
                case 3:
                    if(BuscaPorNome()){
                        System.out.println("Busca realizada com sucesso!");
                    }else{
                        System.out.println("Erro ao realizar busca!");
                    }
                    break;
                case 4:
                    if(RemocaoDeContato()){
                        System.out.println("Contato removido com sucesso!");
                    }else{
                        System.out.println("Erro ao remover contato!");
                    }
                    break;
                case 5:
                    if(AtualizarArquivo()){
                        System.out.println("Arquivo atualizado com sucesso!");
                    }else{
                        System.out.println("Erro ao atualizar arquivo!");
                    }
                    break;
                case 6:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;  
            }
        }
    }

    public static boolean CarregarDados() {
        String nomeArquivo = "./resources/contatos.txt";
        int proximoElemento = 1;
        ArvoreBinaria arvore = new ArvoreBinaria();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split("#");
                if (partes.length == 2) { 
                    String nome = partes[0].trim();
                    String telefone = partes[1].trim();
                    try {
                        arvore.inserir(proximoElemento++, nome, telefone);
                    } catch (Exception e) {
                        System.err.println("Erro ao inserir contato: " + e.getMessage());
                    }
                } else {
                    System.err.println("Formato de contato inválido na linha: " + linha);
                }
            }
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao carregar contatos: " + e.getMessage());
            return false;
        }
    }

    public static boolean ExibeLista() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.caminharCentral();
        return true;
    }

    public static boolean BuscaPorNome() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        String nome = System.console().readLine("Digite a posição do contato: ");
        int posicao = Integer.parseInt(nome);
        arvore.pesquisar(posicao);
        return true;
    }

    public static boolean RemocaoDeContato() {
        ArvoreBinaria arvore = new ArvoreBinaria();
        String nome = System.console().readLine("Digite a posição do contato: ");
        int posicao = Integer.parseInt(nome);
        try {
            arvore.remover(posicao);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    
}
    
