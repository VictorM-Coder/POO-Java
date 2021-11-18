package lapiseiragrafites;

public class Grafite {
    private float calibre;
    private String dureza;
    private int tamanho;

    public Grafite(float calibre, String dureza, int tamanho){
        this.calibre = calibre;
        this.dureza = dureza;
        this.tamanho = tamanho;
    }

    public String toString(){
        return "[" + this.calibre + ":" + this.dureza + ":" + this.tamanho + "]";
    }

    public int desgastePorFolha(){
        switch (dureza){
            case "HB":
                return 1;
            case "2B":
                return 2;
            case "4B":
                return 4;
            case "6B":
                return 6;
            default:
                return 0;
        }
    }

    public float getCalibre() {
        return calibre;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }
}
