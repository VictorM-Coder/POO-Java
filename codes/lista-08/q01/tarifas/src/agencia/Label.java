package agencia;

public enum Label {
    //modifiquei os valores para que seguissem as convenções de nomeclatura
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
    public String getName() {
        return this.name;
    }
    public String toString() {
        return this.name;
    }
}