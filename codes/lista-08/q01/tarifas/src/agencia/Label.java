package agencia;

public enum Label {
    SAQUE("saque"),
    DEPOSITO("deposito"),
    TARIFA("tarifa"),
    EXTORNO("extorno"),
    ABERTURA("abertura");

    private String name;
    //nas enums o Construtor tem que ser privado
    private Label(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    public String toString() {
        return this.name;
    }
}