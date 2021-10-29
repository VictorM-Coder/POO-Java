public class Cadeira {
    private boolean ocupada;

    Cadeira(){
        this.ocupada = false;//as cadeiras quando criadas são postas como desocupadas.
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
