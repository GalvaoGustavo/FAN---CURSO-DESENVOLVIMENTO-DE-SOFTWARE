import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Livros> livros = new ArrayList<>();
    int contador = 0;
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livros novoLivro = new Livros(titulo, autor, anoPublicacao);
        livros.add(novoLivro);
        System.out.println("Livro adicionado com sucesso!");
        contador++;
    }
    int cont =1;
    public void listarLivros(){
        System.out.println();
        System.out.println("Total de livros cadastrados: "+tamanhoLista());
        for(Livros livro : livros){
                System.out.println("Livro: " + cont);
                System.out.println("Titulo:" + livro.titulo);
                System.out.println("Autor:" + livro.Autor);
                System.out.println("Ano: " + livro.anoPublicacao);
                //System.out.println();
                cont++;
        }
    }
    public void exluirLivro(int posicao){
        if(posicao>=0 && posicao<livros.size()){
            //posicao++;
            livros.remove(posicao);
            System.out.println("Livro removido com sucesso.");
            contador--;
        }else{
            System.out.println("Posicao invalida, nenhum livro encontrado.");
        }
    }
    public Livros buscarLivro(String titulo){
        for(Livros livro : livros){
            if(livro.titulo.equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
    }
    public int tamanhoLista(){
        return livros.size();
    }
}

