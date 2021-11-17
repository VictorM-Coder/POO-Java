package lapiseira;

public class Lapiseira {
    private float calibre;
    private Grafite grafite;

    public Lapiseira(float calibre){
        this.calibre = calibre;
    }

    public String toString(){
        return "calibre: " + this.calibre + ", grafite: " + this.grafite;
    }

    public boolean inserir(Grafite grafite){
        if (grafite.getCalibre() == this.calibre){
            this.grafite = grafite;
            return true;
        }else{
            System.out.println("fail: calibre incompatível");
            return false;
        }
    }

    public Grafite remover(){
        if (this.grafite != null){
            Grafite grafiteAux = this.grafite;
            this.grafite = null;

            return grafiteAux;
        }else{
            System.out.println("fail: nao existe grafite");

            return null;
        }
    }

    public void escrever(){

    }
}
