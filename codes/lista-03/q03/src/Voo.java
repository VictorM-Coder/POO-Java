public class Voo {
    private int idVoo = 0;
    private int qntCadeirasOcupadas;
    private Cadeira[] cadeira;//criei um objeto para cadeira, pois achei que facilitaria a sua manipulação
    private Data data;

    Voo(int idVoo, Data data){
        this.idVoo = idVoo;
        this.data = data;
        qntCadeirasOcupadas = 0;

        cadeira = new Cadeira[100];
        for (int cont = 0; cont < cadeira.length; cont++){
            cadeira[cont] = new Cadeira();
        }
    }

    public String toString(){
        return "Voo: " + this.idVoo + "\n" + this.data + "\nCadeiras Ocupadas: " + this.qntCadeirasOcupadas;
    }

    public int proximoLivre(){
        if (this.qntCadeirasOcupadas < 100){
            for (int cont = 0; cont < cadeira.length; cont++){
                if (!this.cadeira[cont].isOcupada()){
                    return cont;
                }
            }
        }
            System.out.println("Todas as cadeiras já foram ocupadas!");
            return -1;
        }

    public boolean verifica(int idCadeira){//esse método é utilizado dentro do método ocupa, assim ao chamar um, chama-se os dois
        return this.cadeira[idCadeira].isOcupada();
    }

    public boolean ocupa(int idCadeira){
        if (idCadeira >= 0 && idCadeira <= 99){
            if (this.verifica(idCadeira)){
                return false;
            }else {
                this.cadeira[idCadeira].ocuparCadeira();
                this.qntCadeirasOcupadas++;
                return true;
            }
        }

        System.out.println("Valor não encontrado! tente um número entre 0 e 99");
        return false;
    }

    public Voo clone(){
        return new Voo(this.idVoo, this.data);
    }

    public int vagas(){
        return (100 - this.qntCadeirasOcupadas);
    }

    public int getVoo(){
        return this.idVoo;
    }

    public Data getData(){
        return this.data;
    }
}
