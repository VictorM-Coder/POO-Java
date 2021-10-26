public class Voo {
    private int idVoo = 0;
    private int qntCadeirasOcupadas;
    private Cadeira[] cadeira;
    private Data data;

    Voo(int idVoo, Data data){
        this.idVoo = idVoo;
        this.data = data;
        cadeira = new Cadeira[100];
        qntCadeirasOcupadas = 0;
    }

    public int proximoLivre(){
        if (this.qntCadeirasOcupadas <= 100){
            int idProximoLivre = 0;
            while (!this.cadeira[idProximoLivre].isOcupada()){
                idProximoLivre++;
            }

            return idProximoLivre;
        }else{
            System.out.println("Todas as cadeiras já foram ocupadas!");
            return -1;
        }
    }

    public boolean verifica(int idCadeira){
        return this.cadeira[idCadeira].isOcupada();
    }

    public boolean ocupa(int idCadeira){
        if (idCadeira >= 0 && idCadeira <= 99){
            if (this.cadeira[idCadeira].isOcupada()){
                System.out.println("esta cadeira já está ocupada");
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
