package questoes.segunda.c;

import questoes.segunda.a.Ponto2D;

public class Linha {
    private Ponto2D ponto1, ponto2;
    private float comprimento;

    public Linha(Ponto2D ponto1, Ponto2D ponto2){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        //usa a fôrmula do calculo da distância entre dois pontos para retornar o coprimento
        this.comprimento = (float) Math.sqrt((Math.pow((this.ponto1.getX() - this.ponto2.getX()), 2)) + Math.pow(this.ponto1.getY() -this.ponto2.getY(), 2));
    }

    public String descreverLinha(){
        return "Coordenadas: A = " + this.ponto1.mostrarPonto() + " B = " + this.ponto2.mostrarPonto() + " Comprimento: " + this.comprimento;
    }
}
