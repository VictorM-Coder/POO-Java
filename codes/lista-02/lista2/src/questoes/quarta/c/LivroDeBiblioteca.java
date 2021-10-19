package questoes.quarta.c;

public class LivroDeBiblioteca {
    private String titulo;
    private int qntPaginas;
    private String autor;
    private String sinopse;
    private boolean estaEmprestado;

    public String descreverLivro(){
        return "título: " + this.titulo + ", Autor: " + this.autor + ", Quantidade de páginas: " + this.qntPaginas + ", sinopse: " + this.sinopse;
    }

    public LivroDeBiblioteca(String titulo, int qntPaginas, String autor, String sinopse) {
        this.titulo = titulo;
        this.qntPaginas = qntPaginas;
        this.autor = autor;
        this.sinopse = sinopse;
    }

    public void emprestarLivro(){
        if (this.estaEmprestado){
            System.out.println("Este livro já está emprestado!");
        }else{
            System.out.println("Livro emprestado!");
            this.estaEmprestado = true;
        }
    }

    public void devolverLivro(){
        this.estaEmprestado = false;
    }
}
