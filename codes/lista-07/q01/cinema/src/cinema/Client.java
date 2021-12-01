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

    public void setId(String id){

    }

    public void setFone(String fone){

    }

    public String getId(){
        return this.id;
    }

    public String getFone(){
        return this.fone;
    }
}