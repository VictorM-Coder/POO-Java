package cinema;

public class  Client {
    private String id;
    private String fone;

    public Client(String id, String fone){
        this.id = id;
        this.fone = fone;
    }

    public String toString(){
        return this.id + ":" + this.fone;
    }

    public String getId(){
        return this.id;
    }

    //tornei estes métodos privados para evitar a quebra de encapsulmento
    private String getFone(){
        return this.fone;
    }

    private void setId(String id){
        this.id = id;
    }

    private void setFone(String fone){
        this.fone = fone;
    }
}