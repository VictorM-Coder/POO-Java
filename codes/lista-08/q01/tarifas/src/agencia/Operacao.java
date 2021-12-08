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

    int getIndice() {
        return this.indice;
    }

    Label getLabel() {
        return this.label;
    }

    int getValue() {
        return this.value;
    }

    int getSaldo() {
        return this.saldo;
    }
};