package tamagotchi;

class Pet {
    private int energyMax, hungryMax, cleanMax;
    private int energy, hungry, shower;
    private int diamonds;
    private int age;
    private boolean alive;

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

    }

    void setClean(int value){

    }

    public Pet(int energy, int hungry, int shower);

    int getClean();

    int getHungry();

    int getEnergy();

    int getEnergyMax();

    int getCleanMax();

    int getHungryMax();

    public String toString();

    public boolean testAlive();

    // Invoca o método testAlive para verificar se o pet esta vivo
    // Se estiver vivo, altere os atributos utilizando os métodos set e get
    public void play();

    public void shower();

    public void eat();

    public void sleep();
}
