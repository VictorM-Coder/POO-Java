public class Cadeira {
    private boolean ocupada;

    Cadeira(){
        this.ocupada = false;
    }

    public void ocuparCadeira(){
        this.ocupada = true;
    }

    public void desocuparCadeira(){
        this.ocupada = false;
    }

    public boolean isOcupada(){
        return this.ocupada;
    }

}
