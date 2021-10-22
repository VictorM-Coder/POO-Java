package questoes.segunda.b;

import questoes.segunda.a.Ponto2D;

public class Retangulo {
    private Ponto2D pontoOpostoA;
    private Ponto2D pontoOpostoB;
    private Ponto2D pontoC, pontoD;
    private float area;

    public Retangulo(Ponto2D pontoOpostoA, Ponto2D pontoOpostoB) {
        if(!pontoOpostoA.paraleloEmUmaDasRetas(pontoOpostoB)){
            this.pontoOpostoA = pontoOpostoA;
            this.pontoOpostoB = pontoOpostoB;
        }else{
            System.out.println("ERRO! os pontos são iguais! os valores foram definidos para o padrão A=(2, 2) e B = (4, 3)");
            this.pontoOpostoA = new Ponto2D(2, 2);
            this.pontoOpostoB = new Ponto2D(4, 3);
        }
        this.pontoC = new Ponto2D(this.pontoOpostoA.getX(), this.pontoOpostoB.getY());
        this.pontoD = new Ponto2D(this.pontoOpostoB.getX(), this.pontoOpostoA.getY());


    }

    public String toString(){
        return "Pontos: A=" + this.pontoOpostoA.mostrarPonto() + ", B=" + this.pontoOpostoB.mostrarPonto()+
                ", C=" + this.pontoC.mostrarPonto()+ ", D=" + this.pontoD.mostrarPonto();
    }
}
