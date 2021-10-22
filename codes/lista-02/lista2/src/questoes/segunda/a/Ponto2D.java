package questoes.segunda.a;

public class Ponto2D {
    private float x, y;

    public boolean pontoEIgual(Ponto2D ponto){
        if (this.x == ponto.x && this.y == ponto.y){
            return true;
        }else{
            return false;
        }
    }

    public boolean paraleloEmUmaDasRetas(Ponto2D ponto){//verifica se o X ou o Y é igual em dois pontos
        if ((this.x == ponto.y) || (this.y == ponto.y)){
            return true;
        }else{
            return false;
        }
    }
    public Ponto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String mostrarPonto(){
        return "(" + this.x + ", " + this.y + ")";
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
