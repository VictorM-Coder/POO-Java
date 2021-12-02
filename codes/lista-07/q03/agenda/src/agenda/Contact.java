package agenda;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<Fone> fones;
    protected String prefix = "-"; //utilizado no toString

    //Crie um ArrayList para o ATRIBUTO fones
    //Se a variável fones não for null, adicione todos os fones usando o método addFone
    public Contact(String name, ArrayList<Fone> fones){

    }

    public String toString(){
        return "";
    }

    //Se fone for válido, insira no atributo fones
    //Se não, informe o erro
    public void addFone(Fone fone){

    }

    //Se o índice existir no ArrayList, remova o telefone com esse índice
    public void rmFone(int index){

    }
    //Use um contador para mostrar o índice do telefone
    //Use o toString do fone para adicioná-lo à saída
    //O resultado dever ficar assim:
    //- david [0:oi:123] [1:tim:9081] [2:claro:5431]

    //GETS e SETS
    String getName(){
        return this.name;
    }
    void setName(String name){

    }

    ArrayList<Fone> getFones(){
        return this.fones;
    }
}
