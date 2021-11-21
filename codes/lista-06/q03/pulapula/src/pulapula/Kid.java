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

    public void setName(String name){
        this.name = name;
    }

    private void setAge(int age){
        this.age = age;
    }

    private int getAge(){
        return this.age;
    }

    private String getName(){
        return this.name;
    }
}
