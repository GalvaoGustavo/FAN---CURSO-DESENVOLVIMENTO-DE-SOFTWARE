import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Livros> listaDeLivros = biblioteca.livros;
        int opcao;

        do {
            //System.out.println();
            System.out.println("Biblioteca - Menu:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Buscar Livro");
            System.out.println("4. Remover Livros");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    input.nextLine();
                    System.out.println();
                    System.out.print("Digite o título do livro: ");
                    String titulo = input.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = input.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = input.nextInt();
                    biblioteca.adicionarLivro(titulo,autor,ano);
                    break;
                case 2:
                    biblioteca.listarLivros();
                    break;
                case 3:
                    input.nextLine();
                    System.out.println();
                    System.out.print("Digite o título do livro que deseja buscar: ");
                    String tituloBusca = input.nextLine();
                    Livros livroEncontrado = biblioteca.buscarLivro(tituloBusca);
                    if(livroEncontrado != null){
                        System.out.println("Livro encontrado");
                        System.out.println("Título: "+livroEncontrado.titulo);
                        System.out.println("Autor: "+livroEncontrado.Autor);
                        System.out.println("Ano da publicacao: "+livroEncontrado.anoPublicacao);
                    }else{
                        System.out.println("Livro nao encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Remover livros\n" +
                            "Lista dos livros cadstrados\n");
                    System.out.println();
                    Livros livros = new Livros();
                    int cont = 1;
                    for(Livros livro : listaDeLivros){
                        System.out.println("Livro: "+cont);
                        System.out.println("Titulo:" + livro.titulo);
                        System.out.println("Autor:" + livro.Autor);
                        System.out.println("Ano: " + livro.anoPublicacao);
                        System.out.println();
                        cont++;
                    }
                    System.out.println("Escolha a numero do livro para ser excluido: ");
                    int posicao = input.nextInt()-1;
                    biblioteca.exluirLivro(posicao);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saindo.....");
                    break;
                default:
                    System.out.println("Opção invalida. Por favor, escolha uma opção válida.");
            }
        }while (opcao!=5);
    }
}