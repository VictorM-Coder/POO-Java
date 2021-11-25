package pulapula;
/**
 * eu não implementei a função papaichegou pois a remove já fazia basicamente a mesma coisa,
 * também modifiquei alguns métodos que já estavam na classe anterior para que podessem se ajustar melhor.
 * Como o adicional não mostrava o fucionamento dos novos métodos, optei pode implementá-los de modo similar ao que as outras
 * questões geralmente pedem. Dada estas modificações, achei melhor criar um arquivo separado para implementar os métodos adicionais.
 */
import java.util.LinkedList;

public class Trampoline{
    public static final double TICKET_PRICE = 2;
    private LinkedList<Kid> waiting;
    private LinkedList<Kid> playing;
    private int maxAge;
    private double caixa;

    public Trampoline(){
        waiting = new LinkedList<>();
        playing = new LinkedList<>();
    }

    public Trampoline(int maxAge){
        this();
        this.maxAge = maxAge;
    }

    public String toString(){
        return "=> " + this.inverseList(this.waiting) + "=> [ " + this.inverseList(this.playing) + "]";
    }

    //insere na lista de espera
    public void arrive(Kid kid){
        if (kid.getAge() <= this.maxAge){
            this.waiting.add(kid);
        }else{
            System.out.println("fail: crianca muito grande");
        }

    }

    //remove da lista de espera e insere na lista playing
    public void in(){
        if (this.playing.isEmpty()){
            this.playing.add(this.waiting.remove(0));
        }else{
            int minAgePlaying = this.minAge(this.playing);

            for (int cont = 0; cont < this.waiting.size(); cont++){
                Kid kidRod = this.waiting.get(cont);
                if ((kidRod.getAge() <= minAgePlaying + 2) && (kidRod.getAge() >= minAgePlaying -2)){
                    this.playing.add(kidRod);
                    this.waiting.remove(cont);
                    break;
                }
            }
        }
    }

    //remove de playing para wainting
    public void out(){
        this.playing.get(0).incrementBill();

        this.waiting.add(this.playing.remove(0));
    }

    //remove do parquinho
    public Kid remove(String name){
        Kid kidReturn = this.removeKid(name, this.waiting);

        if (kidReturn == null){
            kidReturn =  this.removeKid(name, this.playing);
        }

        this.incrementCaixa(kidReturn);
        return kidReturn;
    }

    //retira todas as criancas do pula pula e da fila
    public void fechar(){
        for (int cont  = 0; cont < waiting.size(); cont++){
            this.incrementCaixa(waiting.get(cont));
        }

        for (int cont = 0; cont < playing.size(); cont++){
            this.incrementCaixa(playing.get(cont));
        }

        this.playing.clear();
        this.waiting.clear();
    }

    public double getSaldo(String name){
        Kid kidReturn = waiting.get(this.searchIndexKidByName(name, this.waiting));

        if (kidReturn == null){
            kidReturn =  this.playing.get(this.searchIndexKidByName(name, this.playing));

        }

        return kidReturn.getBill();
    }

    public double getCaixa() {
        return caixa;
    }

    //remove and return the Kid with this name or null
    private Kid removeKid(String name, LinkedList<Kid> list){
        return list.remove(this.searchIndexKidByName(name, list));
    }

    private int searchIndexKidByName(String name, LinkedList<Kid> list){
        for (int cont = 0; cont < list.size(); cont++){
            if (list.get(cont).getName().equals(name)){
                return cont;
            }
        }

        return -1;
    }

    private String inverseList(LinkedList<Kid> list){
        String inverseList = "";

        for (int cont = (list.size() - 1); cont >= 0; cont--){
            inverseList += list.get(cont) + " ";
        }

        return inverseList;
    }

    private void incrementCaixa(Kid kidLeaving){
        this.caixa += kidLeaving.getBill();
    }

    private int minAge(LinkedList<Kid> kids){
        int minAge = this.maxAge;

        for (int cont = 0; cont < kids.size(); cont++){
            int ageRod = kids.get(cont).getAge();
            if (minAge > ageRod){
                minAge = ageRod;
            }
        }

        return minAge;
    }
}