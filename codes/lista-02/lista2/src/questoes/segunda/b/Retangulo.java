package questoes.segunda.b;

import questoes.segunda.a.Ponto2D;

public class Retangulo {
    Ponto2D[] vertices = new Ponto2D[4];

    public Retangulo(Ponto2D[] vertices) {
        boolean pontosSaoIguais = false;
        for (int cont = 0; cont < (vertices.length- 1); cont++){
            if (vertices[cont].pontoEIgual(vertices[cont+1])){
                pontosSaoIguais = true;
                break;
                //Adicionar um verificação de paralelismona classe pontos
            }
        }

        if (!pontosSaoIguais){
            this.vertices = vertices;
        }else{
            System.out.println("valores inválidos! o retângulo foi iniciado com valores padrão");
        }
    }
}
