/*
(a) Escreva uma classe Data cuja instancia (objeto) represente uma data. Esta classe devera
dispor dos seguintes metodos: ´
• construtor: define a data de determinado objeto (atraves de parametro). Este metodo ´
verifica se a data esta correta, caso nao esteja a data é configurada como 01/01/0001. ´
• compara: recebe como parametro um outro objeto da Classe data, compara com a data ˆ
corrente e retorna:
• 0 se as datas forem iguais;
• 1 se a data corrente for maior que a do parametro;
• −1 se a data do parametro for maior que a corrente.
• getDia: retorna o dia da data.
• getMes: retorna o mes da data.
• getMesExtenso: retorna o mes da data corrente por extenso.
• getAno: retorna o ano da data.
• isBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrario. ´
• clone: o objeto clona a si proprio, para isto, ele cria um novo objeto da classe Data com ´
os mesmos valores de atributos e retorna sua referencia pelo metodo. ´
(b) Escreva uma aplicacao que demonstre o uso de instancias da classe  Data, criado no item
acima. Demonstre o uso de todas as operacoes.
 */
public class Data {
    //Constante com os nomes dos meses
    private static final String[] mesesPorExtenso = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    private byte dia, mes;
    private short ano;
    private boolean bissexto;
    private String mesExtenso;

    Data(byte dia, byte mes, short ano){
        if (this.dataEhValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else {
            System.out.println("Valor inválido! valores Default atribuídos");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }

        if ((ano%4 ==0 && (ano%100!=0 || ano%400==0))){
            this.bissexto = true;
        }else{
            this.bissexto = false;
        }

        this.mesExtenso = this.definirMesExtenso(this.mes);
    }

    public  Data clone(){
        return new Data(this.dia, this.mes, this.ano);
    }

    public String toString(){
        return String.format("Data: %d de %s de %d", this.dia, this.mesExtenso, this.ano);
    }

    public byte compara(Data dataComparada){
        if (this.ehIgual(dataComparada)){
            return 0;
        }else if (this.ehMaior(dataComparada)){
            return 1;
        }else{
            return -1;
        }
    }

    private String definirMesExtenso(byte mes){
        return mesesPorExtenso[mes-1];
    }

    private boolean ehIgual(Data dataComparada){
        if (this.dia == dataComparada.getDia() && this.mes == dataComparada.getMes() && this.ano == dataComparada.getAno()){
            return true;
        }else {
            return false;
        }
    }

    /*este é um método que analise se uma data é maior que outra,
    eu o criei para tornar o código mais limpo, reduzindo as atividades realizadas por funções
    */
    private boolean ehMaior(Data dataComparada){
        boolean dataEhIgual = false;

        if (this.ehIgual(dataComparada)){
            return false;
        }

        if(this.ano > dataComparada.getAno()){
            dataEhIgual = true;
        }else if (this.ano == dataComparada.getAno()){
            if (this.mes > dataComparada.getMes()){
                dataEhIgual = true;
            }else if (this.mes == dataComparada.getMes()){
                if (this.dia > dataComparada.getDia()){
                    dataEhIgual = true;
                }
            }
        }
        return dataEhIgual;
    }

    private boolean dataEhValida(byte dia, byte mes, short ano) {
        boolean ehValida = false;
        if(dia <= 31 && dia >= 1 && mes >= 1 && mes <= 12 && ano >= 1){//verifica o intervalo genérico
            if(mes == 2){//faz a verificação caso seja fevereiro
                if ((ano%4 == 0 && (ano%100!=0 || ano%400==0)) && dia <= 29){
                    ehValida = true;
                }
            }else if (( mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia <= 30)){//analisa os meses com 30 dias
                ehValida = true;
            }else if (!( mes == 4 || mes == 6 || mes == 9 || mes == 11)){//analisa os meses com 31 dias
                ehValida = true;
            }
        }
        return ehValida;
    }

    //métodos getters
    public byte getDia(){
        return this.dia;
    }

    public byte getMes(){
        return  this.mes;
    }

    public short getAno(){
        return this.ano;
    }

    public boolean isBissexto() {
        return this.bissexto;
    }

    public String getMesExtenso(){
        return this.mesExtenso;
    }

}
