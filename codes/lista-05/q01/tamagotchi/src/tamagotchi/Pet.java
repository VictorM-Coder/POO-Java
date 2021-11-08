package tamagotchi;

public class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;//troquei o nome da variável shower pr clean para manter o padrão
    private int diamonds;
    private int age;
    private boolean alive;

    public Pet(int energy, int hungry, int clean){
        this.energyMax = energy;
        this.hungryMax = hungry;
        this.cleanMax = clean;
        
        this.setEnergy(energy);
        this.setHungry(hungry);
        this.setClean(clean);
        
        this.age = 0;
        this.diamonds = 0;
    }

    public String toString(){
        return "E:" + this.energy + "/" + this.energyMax + ", S:" + this.hungry + "/" + this.hungryMax + ", L:"
                + this.clean + "/" + this.cleanMax + ", D:" + this.diamonds + ", I:" + this.age;
    }
    
    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    public void play(){

    }

    public void shower(){

    }

    public void eat(){

    }

    public void sleep(){

    }

    private int returnAtributeBasedOnMax(int value, int maxValue){
        if (value <= 0){
            return 0;
        }else if (value > maxValue){
            return maxValue;
        }else{
            return value;
        }
    }

    // Atribui o valor de energia
    // Se o valor ficar abaixo de 0, o pet morre de fraqueza
    // Garanta que os valores ficarão no interalo 0 - max
    // Use esse modelo para fazer os outros métodos set
    void setEnergy(int value) {
        if (value <= 0) {
            this.energy = 0;
            System.out.println("fail: pet morreu de fraqueza");
            this.alive = false;
        } else if (value > this.energyMax)
            this.energy = this.energyMax;
        else
            this.energy = value;
    }

    void setHungry(int value){
       this.hungry = this.returnAtributeBasedOnMax(value, this.hungryMax);

       if (this.hungry == 0){
           this.alive = false;
           System.out.println("fail: pet morreu de fome");
       }
    }

    void setClean(int value){
        this.clean = this.returnAtributeBasedOnMax(value, this.hungryMax);

        if (this.clean == 0){
            this.alive = false;
            System.out.println("fail: pet morreu de sujeira");
        }
    }

    int getClean(){
        return this.clean;
    }

    int getHungry(){
        return this.hungry;
    }

    int getEnergy(){
        return this.energy;
    }

    int getEnergyMax(){
        return this.energyMax;
    }

    int getCleanMax(){
        return this.cleanMax;
    }

    int getHungryMax(){
        return this.hungryMax;
    }

    public boolean testAlive(){
        if (!this.alive){
            System.out.println("fail: pet esta morto");
        }
        
        return this.alive;
    }


}
