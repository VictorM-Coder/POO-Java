package agenda1;

public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number){
        this.id = id;
        this.number = number;
    }

    //O resultado deve ficar assim
    //oi:1234
    public String toString(){
        return this.id + ":" + this.number;
    }


    public boolean isValid(){
        return validate(this.number);
    }

    //verifica se o número é um número de telefone válido
    public static boolean validate(String number){
        for (int cont  = 0; cont < number.length(); cont++){
            char character = number.charAt(cont);

            if (!(character == '1' || character == '2'|| character == '3'|| character == '4'|| character == '5'|| character == '6'|| character == '7'|| character == '8'|| character == '9'|| character == '('|| character == ')'|| character == '.')){
                return false;
            }
        }

        return true;
    }

    //GETS e SETS
    public String getNumber(){
        return this.number;
    }

    //tornei estes métodos privados para preservar o encapsulamento
    private void setNumber(String number){
        this.number =number;
    }

    private String getId(){
        return this.id;
    }

    private void setId(String id){
        this.id = id;
    }
}
