package agencia;

public class Conta {
    //O número da conta
    private int id;
    private Financas financas;

    public Conta(int id){
        this.id = id;
        this.financas = new Financas();
        this.creditar(Label.ABERTURA, 0);
    }

    public String toString(){
        return "conta:" + this.id + " " + this.financas;
    }

    //só realiza a operação se houver dinheiro suficiente na conta
    public boolean sacar(int value){
        if ((this.financas.getSaldo() - value) >= 0){
            this.financas.addOperacao(Label.SAQUE, value);

            return true;
        }
        System.out.println("fail: saldo insuficiente");
        return false;
    }

    //retira o dinheiro, mesmo que o saldo fique negativo
    public boolean tarifar(int value){
        this.financas.addOperacao(Label.TARIFA, value);
        return true;
    }

    //se o índice for válido e representar uma operação de tarifa
    //adicione o mesmo valor tarifado, mas com label de extorno
    public boolean extornar(int indice){

        if (indice < this.financas.getNextId() && indice >= 0){
            Operacao operacao = this.financas.getExtrato().get(indice);

            if (operacao.getLabel() == Label.TARIFA){
                this.financas.addOperacao(Label.EXTORNO, operacao.getValue());

                return true;
            }else{
                System.out.println("fail: indice " + indice + " nao e tarifa");
            }
        }else{
            System.out.println("fail: indice " + indice + " invalido");
        }

        return false;
    }

    //adiciona valor à conta
    public boolean creditar(Label label, int value){
        if (value >= 0){
            this.financas.addOperacao(label, value);

            return true;
        }
        System.out.println("fail: valor invalido");
        return false;
    }

    public Financas getFinancas(){
        return this.financas;
    }
}
