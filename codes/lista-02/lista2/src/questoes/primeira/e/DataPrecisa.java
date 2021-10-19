package questoes.primeira.e;


public class DataPrecisa {
    byte dia, mes; // atributos ou campos
    short ano;

    public void inicializaDataSimples(byte d, byte m, short a) {
        if(dataEhValida(d,m,a)) {
            dia = d;
            mes = m;
            ano = a;
        }
        else {
            dia = mes = 0;
            ano = 0;
            System.out.println("Data inválida!");
        }
    }


    boolean dataEhValida(byte dia, byte mes, short ano) {
        if(dia > 31 || dia < 1 || mes > 12 || mes <0){
            return false;
        }else if(mes == 2){
            if (((ano%4 ==0 && (ano%100!=0 || ano%400==0)) && dia == 29) || dia <= 28){
                return true;

            }else{
                return false;
            }
        }else if (!(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes ==8 || mes == 10 || mes == 12) && dia == 31){
            return false;
        }
        return true;
    }



    boolean ehIgual(DataPrecisa data) {
        if( (dia == data.dia) && (mes == data.mes) &&
                (ano == data.ano) )
            return true;
        else
            return false;
    }


    public void mostraData() {
        if(this.dia == 0 || this.mes ==0 || this.ano==0){//verifica se os atributos são válidos
            System.out.println("Data inválida!");
        }else{
            System.out.println(dia + "/" + mes + "/" + ano);
        }

    }
}
