package lapiseiragrafites;

import java.util.ArrayList;

public class Lapiseira {
    private float calibre;
    private Grafite bico;
    private ArrayList<Grafite> tambor;

    public Lapiseira(float calibre){
        this.calibre = calibre;
    }

    //ajustar o toString do grafite para quando for null retornar uma String vazia
    public String toString(){
        return "calibre: " + this.calibre + ", bico: " + this.bico + ", tambor: {" + this.tambor + "}";
    }

    public boolean inserir(Grafite grafite){
        if (this.calibre == grafite.getCalibre()){
            this.tambor.add(grafite);

            return true;
        }else{
            System.out.println("fail: calibre incompatível");
            return false;
        }
    }

    public Grafite remover(){
        return null;
    }

    public boolean puxar(){
        return false;
    }

    public void escrever(){

    }
}
