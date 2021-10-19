package dominio;

class DataSimples { // declaracao da classe

    byte dia, mes; // atributos ou campos
    short ano;

    void inicializaDataSimples(byte d, byte m, short a) {
        if(dataEhValida(d,m,a)) {
            dia = d;
            mes = m;
            ano = a;
        }
        else {
            dia = mes = 0;
            ano = 0;
        }
    }

    boolean dataEhValida(byte d, byte m, short a) {
        if(d >= 1 && d <= 31 && m >= 1 && m <= 12)
            return true;
        else
            return false;
    }

    boolean ehIgual(DataSimples data) {
        if( (dia == data.dia) && (mes == data.mes) &&
                (ano == data.ano) )
            return true;
        else
            return false;
    }


    void mostraData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}

