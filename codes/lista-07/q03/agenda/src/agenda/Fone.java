package agenda;

public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number){

    }

    //O resultado deve ficar assim
    //oi:1234
    public String toString(){
        return "";
    }

    //verifica se o número é um número de telefone válido
    public static boolean validate(String number){
        return false;
    }

    //GETS e SETS
    String getId(){
        return this.id;
    }

    void setId(String id){

    }

    String getNumber(){
        return this.number;
    }

    void setNumber(String number){

    }
}
