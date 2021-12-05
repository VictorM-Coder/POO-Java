package agenda;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<Fone> fones;
    protected String prefix = "-"; //utilizado no toString

    //Crie um ArrayList para o ATRIBUTO fones
    //Se a variável fones não for null, adicione todos os fones usando o método addFone
    public Contact(String name, ArrayList<Fone> fones){
        this.name = name;
        this.fones = new ArrayList<Fone>();

        if (fones != null){
            for (Fone fone: fones){
                this.addFone(fone);
            }
        }
    }

    //Use um contador para mostrar o índice do telefone
    //Use o toString do fone para adicioná-lo à saída
    //O resultado dever ficar assim:
    //- david [0:oi:123] [1:tim:9081] [2:claro:5431]
    public String toString(){
        String out = this.prefix + " " + this.name;

        if (this.fones != null) {
            for (int cont = 0; cont < this.fones.size(); cont++){
                out += " [" + cont + ":" + this.fones.get(cont) + "]";
            }
        }

        return out;
    }

    //Se fone for válido, insira no atributo fones
    //Se não, informe o erro
    public void addFone(Fone fone){
        if(fone.isValid()){
            this.fones.add(fone);
        }else{
            System.out.println("fail: invalid number");
        }
    }

    //Se o índice existir no ArrayList, remova o telefone com esse índice
    public void rmFone(int index){
        if (index >= 0 && index < this.fones.size()){
            this.fones.remove(index);
        }
    }


    //GETS e SETS
    //mantive estes métodos privados para preservar o encapsulamento
    private String getName(){
        return this.name;
    }

    private void setName(String name){
        this.name = name;
    }

    private ArrayList<Fone> getFones(){
        return this.fones;
    }

    private void setFones(ArrayList<Fone> fones){
        this.fones = fones;
    }
}
