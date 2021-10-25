package questoes.terceira;

public class Poligono {
    private int qntLados;
    private int qntVertices;
    private String nome;

    public String descreverPoligono(){
        return "nome: " + this.nome + ", Quantidade de lados: " + this.qntLados;
    }
    public Poligono(int qntLados){
        if (qntLados < 3 || qntLados > 10){//chega se a quantidade de lados pode gerar um polígono e se está dentro do tamanho estipulado
            System.out.println("Valor de lados inválido! polígono definido como um triângulo");
            qntLados = 3;
        }
        this.qntLados = qntLados;
        this.qntVertices = qntLados;
        this.nome = this.definirNome(qntLados);
    }

    private String definirNome(int qntLados){
        switch (qntLados){
            case 3:
                return "Triângulo Equilátero";
            case 4:
                return "Quadrado regular";
            case 5:
                return "Pentágono regular";
            case 6:
                return "Hexágono regular";
            case 7:
                return "Heptágono regular";
            case 8:
                return "Octógono regular";
            case 9:
                return "Eneágono regular";
            case 10:
                return "Decágono regular";
            default:
                return "";
        }
    }
}
