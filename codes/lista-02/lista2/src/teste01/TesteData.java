package teste01;

import questoes.primeira.a.HoraAproximada;
import questoes.primeira.c.DataHora;
import questoes.primeira.e.DataPrecisa;

public class TesteData {
    public static void main(String[] args) {
        /*HoraAproximada hora = new HoraAproximada(3,20);
        DataHora dh = new DataHora(hora, (byte) 2,(byte) 3,(short) 2022);

        dh.getDataEHora();*/

        DataPrecisa dp = new DataPrecisa();

        dp.inicializaDataSimples((byte) 29, (byte)2, (short) 2000);

        dp.mostraData();

    }
}
