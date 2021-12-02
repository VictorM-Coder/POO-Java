package cinema;

import java.util.ArrayList;

public class Sala{
    private ArrayList<Client> cadeiras;

    public Sala(int capacidade){
        cadeiras = new ArrayList<>(capacidade);

        for (int cont = 0; cont  < capacidade; cont++){
            cadeiras.add(null);
        }
    }

    public String toString(){
        String roomPositions = "[ ";

        for (int cont = 0; cont < this.cadeiras.size(); cont++){
            if (this.cadeiras.get(cont) == null){
                roomPositions += "- ";
            }else{
                roomPositions += this.cadeiras.get(cont) + " ";
            }
        }

        roomPositions += "]";

        return roomPositions;
    }

    public ArrayList<Client> getCadeiras(){
        return this.cadeiras;
    }

    public boolean reservar(String id, String fone, int ind){
        boolean isOk = false;

        if (searchClientIndexById(id, this.cadeiras) == -1){
            if (this.checkInterval(ind)){
                if (this.cadeiras.get(ind) == null){
                    this.cadeiras.set(ind, new Client(id, fone));
                    isOk = true;
                }else{
                    System.out.println("fail: cadeira ja esta ocupada");
                }
            }
        }else{
            System.out.println("fail: cliente ja esta no cinema");
        }

        return isOk;
    }

    public void cancelar(String id){
        int indexId = this.searchClientIndexById(id, this.cadeiras);

        if (indexId != -1){
            this.cadeiras.set(indexId, null);
        }else{
            System.out.println("fail: cliente nao esta no cinema");
        }
    }

    /***
     *
     * @param id
     * @param clients
     * @return o index do Client com id igual ao passado como parâmetro caso ele seja encontrado,
     * do contrário retorna -1
     */
    private static int searchClientIndexById(String id, ArrayList<Client> clients){
        for (int cont = 0; cont <  clients.size(); cont++){
            if (clients.get(cont) != null){
                if (clients.get(cont).getId().equals(id)){
                    return cont;
                }
            }
        }

        return -1;
    }

    private boolean checkInterval(int index){
        if (index >= 0 && index < this.cadeiras.size()){
            return true;
        }else{
            return false;
        }
    }

}