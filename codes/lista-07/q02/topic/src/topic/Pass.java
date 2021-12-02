package topic;

public class Pass {
    private String name;
    private int age;
    public Pass(String name, int age){

    }

    public String toString(){
        return "";
    }

    //return true if pass.age >= 65
    public boolean isPriority(){
        return false;
    }

    //GETS e SETS
    String getName(){
        return this.name;
    }
    void setName(String name){

    }

    int getAge(){
        return this.age;
    }

    void setAge(int age){

    }
}
