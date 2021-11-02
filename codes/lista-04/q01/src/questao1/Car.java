package questao1;
/*
INICIAR
Iniciar de tanque vazio, sem ninguém dentro e com 0 de quilometragem.
Para simplificar, nosso carro esportivo suporta até duas pessoas e seu
tanque suporta até 100 litros de gás como combustível.

ENTRANDO E SAIND0
Embarcar uma pessoa por vez.
Desembarcar uma pessoa por vez.
Não embarque além do limite ou desembarque se não houver ninguém no carro.

ABASTECER
Abastecer o tanque passando a quantidade de litros de combustível.
Caso tente abastecer acima do limite, descarte o valor que passou.

DIRIGIR
Caso haja pelo menos uma pessoa no carro e algum combustível, ele deve gastar combustível andando
e aumentar a quilometragem.
Nosso carro faz um quilômetro por litro de gás.
Caso não exista combustível suficiente para completar a viagem inteira, dirija o que for possível
e emita uma mensagem indicando quanto foi percorrido.
 */
public class Car {
    private int pass; // Passageiros
    private int passMax; // limite de Passageiros
    private int gas; // tanque
    private int gasMax; // limite do tanque
    private int km; // quantidade de quilometragem

    public Car(){
        this.gas = 0;
        this.pass = 0;
        this.km = 0;
        this.passMax = 2;
        this.gasMax = 100;
    }

    public String toString(){
        return "pass: " + this.pass + ", gas: " + this.gas + ", km: " + this.km;
    }

    public void in(){
        if (pass < passMax){
            pass++;
        }else{
            System.out.println("fail: Limite de pessoas atingido");
        }
    }

    public void out(){
        if (pass > 0){
            pass--;
        }else{
            System.out.println("fail: nao ha ninguem no carro");
        }
    }

    public void fuel(int gas){
        if ((this.gas + gas) > this.gasMax){
            this.gas = this.gasMax;
        }else{
            this.gas += gas;
        }
    }

    public void drive (int km){
        if (this.pass == 0){
            System.out.println("fail: nao ha ninguem no carro");
        }else if(this.gas == 0){
            System.out.println("fail: tanque vazio");
        }else{
            if (this.gas >= km){
                this.gas -= km;
                this.km += km;
            }else{
                System.out.println("fail: tanque vazio apos andar " + this.gas + " km");

                this.km += this.gas;
                this.gas = 0;
            }
        }
    }
}
