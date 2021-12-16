package agencia;

public class Operacao {
    private int indice;
    private Label label;
    //O valor em negativo se for débito
    private int value;
    //O saldo residual
    private int saldo;

    public Operacao(int indice, Label label, int value, int saldo) {
        this.indice = indice;
        this.label = label;
        this.value = value;
        this.saldo = saldo;
    }

    //faz o preenchimento da string com espaços em branco até completar o length
    public static String pad(String string, int length) {
        return String.format("%1$"+length+ "s", string);
    }

    public String toString() {
        return pad("" + indice, 2) + ":" + pad("" + label, 9) + ":" + pad("" + value, 5) + ":" + pad("" + saldo, 5);
    }

    //GETS AND SETS
    public Label getLabel() {
        return this.label;
    }

    public int getValue() {
        return this.value;
    }

    //torneir estes métodos privados para presevar o encapsualmento, já que não foi necessário seu nesta aplicação
    private int getIndice() {
        return this.indice;
    }

    private int getSaldo() {
        return this.saldo;
    }
};