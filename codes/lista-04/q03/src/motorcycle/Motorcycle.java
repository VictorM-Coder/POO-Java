package motorcycle;

public class Motorcycle{
    private Person person; //agregacao
    private int power;
    private int time;

    public Motorcycle(int power){ //Inicia o atributo power, time com zero e person com null
        this.power = power;
        this.time = 0;
        this.person = null;
    }

    public String toString(){
        return "power: " + this.power + ", minutos: " + this.time + ", person: " + this.person;
    }

    public void buy(int time){ //Comprar mais tempo
        this.time += time;
    }


    public boolean in(Person person){//Se estiver vazio, coloca a pessoa na moto e retorna true
        if (this.person != null){
            System.out.println("fail: moto ocupada");
            return false;
        }else{
            this.person = person;
            return true;
        }
    }

    public Person out(){//Se houver uma person, retira e retorna, senão, retorna null
        if(this.isPerson()){
            Person auxPerson = this.person;
            this.person = null;
            return auxPerson;
        }else{
            return null;
        }
    }

    public void drive(int time){
        if (this.isPerson()){
            if (this.person.getAge() <= 10){

                //pode passear
                if (this.time == 0){
                    System.out.println("fail: tempo zerado");
                } else if (time > this.time){
                    System.out.println("fail: andou " + this.time + " e acabou o time");
                    this.time = 0;
                }else{
                    this.time -= time;
                }

            }else{
                System.out.println("fail: muito grande para andar de moto");
            }
        }
    }

    public void honk(){//buzinar
        if (this.isPerson()){
            String buzina = "P";
            for (int cont  = 1; cont <= this.power; cont++){
                buzina += "e";
            }
            buzina += "m";

            System.out.println(buzina);
        }
    }

    private boolean isPerson(){
        if (this.person == null){
            System.out.println("fail: moto vazia");
            return false;
        }else{
            return true;
        }
    }
}
