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
        if (this.temGrafite()){
            System.out.println("fail: ja existe grafite");
            return false;
        }

        if (grafite.getCalibre() == this.calibre){
            this.grafite = grafite;
            return true;
        }else{
            System.out.println("fail: calibre incompativel");
            return false;
        }
    }

    public Grafite remover(){
        if (this.temGrafite()){
            Grafite grafiteAux = this.grafite;
            this.grafite = null;

            return grafiteAux;
        }else{
            System.out.println("fail: nao existe grafite");

            return null;
        }
    }

    public void escrever(){
        if (this.temGrafite()){

            if(this.grafite.getTamanho() > 10){
                int tamanhoResto = this.grafite.getTamanho() - this.grafite.desgastePorFolha();

                if ( tamanhoResto >= 10){
                    this.grafite.setTamanho(tamanhoResto);
                }else{
                    this.grafite.setTamanho(10);
                    System.out.println("fail: folha incompleta");
                }
            }

            if (this.grafite.getTamanho() <= 10){
                System.out.println("warning: grafite acabou");
            }
        }

    }

    private boolean temGrafite(){
        return (this.grafite != null);
    }
}
