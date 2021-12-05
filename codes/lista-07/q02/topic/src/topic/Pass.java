package topic;

public class Pass {
    private String name;
    private int age;

    public Pass(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return  this.name + ":" + this.age;
    }

    //return true if pass.age >= 65
    public boolean isPriority(){
        return (this.age >= 65);
    }

    //GETS e SETS
    public String getName(){
        return this.name;
    }

    //como não achei necessária a aplicação destes métodos os mantive privados para evitar quebra de encapsulamento
    private void setName(String name){
        this.name = name;
    }

    private void setAge(int age){
        this.age = age;
    }

    private int getAge(){
        return this.age;
    }
}
