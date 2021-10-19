package teste01;

import questoes.primeira.e.DataPrecisa;

public class TesteData {
    public static void main(String[] args) {
        DataPrecisa dp = new DataPrecisa();

        dp.inicializaDataSimples((byte) 31, (byte)5, (short) 2000);

        dp.mostraData();

    }
}
