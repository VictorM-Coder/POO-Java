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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQntPaginas() {
        return qntPaginas;
    }

    public void setQntPaginas(int qntPaginas) {
        this.qntPaginas = qntPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
}
