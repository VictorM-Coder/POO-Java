package teste01;

import questoes.segunda.b.Retangulo;
import questoes.segunda.c.Linha;
import questoes.segunda.a.Ponto2D;

public class TestePontos {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(1,1);
        Ponto2D p2 = new Ponto2D(1, 1);
        Retangulo r1 = new Retangulo(p1, p2);

        System.out.println(r1);
    }
}
