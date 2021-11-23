package pulapula;

public class Kid {
    private int age;
    private String name;
    private double bill;

    public Kid(String name, int age){
        this.name = name;
        this.age = age;
        this.bill = 0;
    }

    public void incrementBill(){
        this.bill+= Trampoline.TICKET_PRICE;
    }

    public String toString(){
        return this.name + ":" + this.age;
    }

    public double getBill(){
        return this.bill;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    private void setAge(int age){
        this.age = age;
    }

    private int getAge(){
        return this.age;
    }

}
