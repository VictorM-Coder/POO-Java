package questoes.quarta.a;

public class Livro {
    private String titulo;
    private int qntPaginas;
    private String autor;
    private String sinopse;

    public String descreverLivro(){
        return "título: " + this.titulo + ", Autor: " + this.autor + ", Quantidade de páginas: " + this.qntPaginas + ", sinopse: " + this.sinopse;
    }

    public Livro(String titulo, int qntPaginas, String autor, String sinopse) {
        this.titulo = titulo;
        this.qntPaginas = qntPaginas;
        this.autor = autor;
        this.sinopse = sinopse;
    }
}
