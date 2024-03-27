public class Livros {
    private String Titulo;
    private String Autor;
    private int anoPublicacao;
    private boolean disponibilidadevro;

    public Livros(String titulo, String autor, int anoPublicacao, boolean disponibilidadevro) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidadevro = true;
    }

    public Livros(String titulo, String autor, int anoPublicacao) {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidadevro() {
        return disponibilidadevro;
    }

    public void setDisponibilidadevro(boolean disponibilidadevro) {
        this.disponibilidadevro = disponibilidadevro;
    }

    public void add(Livros livros) {
    }
}

