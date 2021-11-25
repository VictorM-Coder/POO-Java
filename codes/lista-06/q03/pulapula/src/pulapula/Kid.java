package pulapula;

public class Kid {
    private int age;
    private String name;

    public Kid(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name + ":" + this.age;
    }

    //troquei o modificador do getName para público uma vez que assim podemos ter fácil acesso ao nome para a pesquisa realizada na classe Trampoline
    public String getName(){
        return this.name;
    }

    //optei por tornar o setName para private uma vez que não há necessidade, ou situação que justique uma criança mudar de nome neste caso
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
