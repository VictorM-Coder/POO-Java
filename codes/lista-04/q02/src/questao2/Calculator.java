package questao2;

import java.text.DecimalFormat;

public class Calculator {
    private int batteryMax;
    private int battery;
    private float display;

    public Calculator(int batteryMax){ //Inicia os atributos, battery e display começam com o zero.
        this.batteryMax = batteryMax;
        this.display = 0;
        this.battery = 0;
    }

    public void chargeBattery(int value){//Aumenta a bateria, porém não além do máximo.
        if ((value + this.battery) < this.batteryMax){
            this.battery += value;
        }else{
            this.battery = this.batteryMax;
        }
    }


    public boolean useBattery(){//Tenta gastar uma unidade da bateria e emite um erro se não conseguir.
        if (this.battery > 0){

        }
        return false;
    }

    public void sum(int a, int b){//Se conseguir gastar bateria, armazene a soma no atributo display.
        if (this.battery > 0){
            this.display = a + b;
            this.battery--;
        }else{
            System.out.println("fail: bateria insuficiente");
        }
    }

    public void division(int num, int den){//Se conseguir gastar bateria e não for divisão por 0.

    }

    public String toString(){//Retorna o conteúdo do display com duas casas decimais.
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(this.display);
    }
}
