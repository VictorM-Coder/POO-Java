package lapiseiragrafites;

import java.util.ArrayList;

public class Lapiseira {
    private float calibre;
    private Grafite bico;
    private ArrayList<Grafite> tambor;

    public Lapiseira(float calibre){
        this.calibre = calibre;
        tambor = new ArrayList<Grafite>();
    }

    public String toString(){
        String valorBico = (this.grafiteEstaCarregado())?this.bico.toString() : "[]";
        //String valorTambor = (!this.tambor.isEmpty())?this.tambor.toString() : "";

        return "calibre: " + this.calibre + ", bico: " + valorBico + ", tambor: {" + this.arrayListToString() + "}";
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
        Grafite grafiteAux = this.bico;
        this.bico = null;

        return grafiteAux;
    }

    public boolean puxar(){
        if(!this.grafiteEstaCarregado()){
            if (!tambor.isEmpty()){
                this.bico = this.tambor.remove(0);
            }else{
                System.out.println("fail: nao existe grafite no tambor");
            }
            return true;
        }else{
            System.out.println("fail: ja existe grafite no bico");
            return false;
        }
    }

    public void escrever(){
        if (this.grafiteEstaCarregado()){
            if (this.bico.getTamanho() > 10){
                int grafiteResto = this.bico.getTamanho() - this.bico.desgastePorFolha();

                if (grafiteResto <= 10){
                    System.out.println("fail: folha imcompleta");
                    this.bico.setTamanho(10);
                }else{
                    this.bico.setTamanho(grafiteResto);
                }
            }

            if (this.bico.getTamanho() <= 10){
                System.out.println("warning: grafite acabou");
            }
        }else{
            System.out.println("fail: nao existe grafite no bico");
        }
    }

    private boolean grafiteEstaCarregado(){
        if (this.bico != null){
            return true;
        }else {
            return false;
        }
    }

    private String arrayListToString(){
        String stringList = "";

        for (int cont = 0; cont < this.tambor.size(); cont++){
            stringList += this.tambor.get(cont);
        }

        return stringList;
    }
}
