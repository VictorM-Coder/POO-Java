package tamagotchi;

public class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, clean;//troquei o nome da variável shower pr clean para manter o padrão
    private int diamonds;
    private int age;
    private boolean alive;

    public Pet(int energy, int hungry, int clean){
        if (energy > 0 && hungry > 0 && clean > 0){
            this.alive = true;

            this.energyMax = energy;
            this.hungryMax = hungry;
            this.cleanMax = clean;

            this.energy = energy;
            this.hungry = hungry;
            this.clean = clean;
        }else {
            this.alive = false;

            this.energyMax = 0;
            this.hungryMax = 0;
            this.cleanMax = 0;

            this.energy = 0;
            this.hungry = 0;
            this.clean = 0;
        }



        
        this.age = 0;
        this.diamonds = 0;
    }

    public String toString(){
        return "E:" + this.energy + "/" + this.energyMax + ", S:" + this.hungry + "/" + this.hungryMax + ", L:"
                + this.clean + "/" + this.cleanMax + ", D:" + this.diamonds + ", I:" + this.age + "\n";
    }
    
    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    public void play(){
        if (this.testAlive()){
            this.setEnergy(this.energy - 2);
            this.setHungry(this.hungry - 1);
            this.setClean(this.clean - 3);
            this.diamonds++;
            this.age++;
        }
    }

    public void shower(){
        if (this.testAlive()){
            this.setEnergy(this.energy - 3);
            this.setHungry(this.hungry - 1);
            this.setClean(this.cleanMax);
            this.age+=2;
        }
    }

    public void eat(){
        if (this.testAlive()){
            this.setEnergy(this.energy - 1);
            this.setHungry(this.hungry + 4);
            this.setClean(this.clean - 2);
            this.age++;
        }
    }

    public void sleep(){
        if (this.testAlive()){
            if ((this.energyMax - this.energy >= 5)){
                this.age += this.energyMax - this.energy;
                this.setHungry(this.hungry - 1);
                this.setEnergy(this.energyMax);
            }else{
                System.out.println("fail: nao esta com sono");
            }

        }
    }

    // Atribui o valor de energia
    // Se o valor ficar abaixo de 0, o pet morre de fraqueza
    // Garanta que os valores ficarão no interalo 0 - max
    // Use esse modelo para fazer os outros métodos set
    public void setEnergy(int value) {//OBS.:tomei a liberdade de reformular a lógica para algo que achei interessente
        this.energy = this.returnAtributeBasedOnMax(value, this.energyMax);

        if (this.energy == 0){
            this.alive = false;
            System.out.println("fail: pet morreu de fraqueza");
        }
    }

    public void setHungry(int value){
       this.hungry = this.returnAtributeBasedOnMax(value, this.hungryMax);

       if (this.hungry == 0){
           this.alive = false;
           System.out.println("fail: pet morreu de fome");
       }
    }

    public void setClean(int value){
        this.clean = this.returnAtributeBasedOnMax(value, this.cleanMax);

        if (this.clean == 0){
            this.alive = false;
            System.out.println("fail: pet morreu de sujeira");
        }
    }

    public boolean testAlive(){
        if (!this.alive){
            System.out.println("fail: pet esta morto");
        }
        return this.alive;
    }

    /**
     * Garante que o valor esteja dentro intervalo possível
     * @param value
     * @param maxValue
     * @return se value < 0, return = 0, se value > maXValue, retorna maxValue, senão return = value
     */
    private int returnAtributeBasedOnMax(int value, int maxValue){
        if (value <= 0){
            return 0;
        }else if (value > maxValue){
            return maxValue;
        }else{
            return value;
        }
    }
}
