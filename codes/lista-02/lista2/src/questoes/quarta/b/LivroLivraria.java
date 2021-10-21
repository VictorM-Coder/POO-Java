package questoes.quarta.b;

public class LivroLivraria {
    private String titulo;
    private int qntPaginas;
    private String autor;
    private String sinopse;
    private float preço;
    private String genero;
    private boolean estaEmEstoque;

    public String descreverLivro(){
        return "título: " + this.titulo + ", Autor: " + this.autor + ", Gênero: " + this.genero + ", Quantidade de páginas: "
                + this.qntPaginas + ", sinopse: " + this.sinopse
                +", Preço: " +this.preço + ", está em estoque: " + this.estaEmEstoque;
    }

    public LivroLivraria(String titulo, int qntPaginas, String autor, String sinopse, float preço, String genero, boolean estaEmEstoque) {
        this.titulo = titulo;
        this.qntPaginas = Math.abs(qntPaginas);
        this.autor = autor;
        this.sinopse = sinopse;
        this.preço = Math.abs(preço);
        this.genero = genero;
        this.estaEmEstoque = estaEmEstoque;
    }
}
