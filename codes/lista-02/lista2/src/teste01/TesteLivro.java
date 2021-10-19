package teste01;

import questoes.quarta.a.Livro;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Call of Cthulhu", 120, "HP Lovrecaft", "Ph´nglui mglw´nafh Cthulhu R´lyeh wgah´nagl fhtagn");

        System.out.println(livro1.descreverLivro());
    }
}
