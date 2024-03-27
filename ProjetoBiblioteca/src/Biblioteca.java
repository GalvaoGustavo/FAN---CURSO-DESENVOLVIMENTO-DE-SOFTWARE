import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livros> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livros livros = new Livros(titulo, autor, anoPublicacao);
        livros.add(livros);
        System.out.println("Livro adicionado com sucesso!");
    }
    public void listarLivros(){
        System.out.println("Lista de livros: ");
        for(Livros livro : livros){
            System.out.println("Titulo:"+livro.getTitulo());
            System.out.println("Autor:"+livro.getAutor());
            System.out.println("Ano: "+livro.getAnoPublicacao());
        }
    }
    public Livros buscarLivro(String titulo){
        for(Livros livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(livro.getTitulo())){
                return livro;
            }
        }
        return null;
    }

}

