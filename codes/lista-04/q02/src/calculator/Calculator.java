package calculator;

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

    public String toString(){//Retorna o conteúdo do display com duas casas decimais.
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return "display = " + decimalFormat.format(this.display) + ", battery = " + this.battery;
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
            this.battery--;
            return true;
        }else{
            System.out.println("fail: bateria insuficiente");
            return false;
        }

    }

    public void sum(int a, int b){//Se conseguir gastar bateria, armazene a soma no atributo display.
        if (this.useBattery()){
            this.display = a + b;
        }
    }

    public void division(int a, int b){//Se conseguir gastar bateria e não for divisão por 0.
        if (this.useBattery()){
            if (b == 0){
                System.out.println("fail: divisao por zero");
            }else{
                this.display = (float) a/b;
            }
        }
    }

    public void subtract(int a, int b){
        if (this.useBattery()){
            this.display = a - b;
        }
    }

    public void multiply(int a, int b){
        if (this.useBattery()){
            this.display = a * b;
        }
    }


}
