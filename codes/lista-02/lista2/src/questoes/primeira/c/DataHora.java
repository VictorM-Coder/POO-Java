package questoes.primeira.c;

import questoes.primeira.a.HoraAproximada;
import questoes.primeira.e.DataPrecisa;

/*OBS.: eu instanciei a classe DataSimples aqui em vez de copiar a classe data diretamente,
 pois assim os arquivos ficariam mais organizados*/
public class DataHora {
    HoraAproximada hora;
    DataPrecisa data;

    public DataHora(HoraAproximada horaAproximada, byte dia, byte mes, short ano){
        this.hora = horaAproximada;
        data.inicializaDataSimples(dia, mes, ano);
    }

    public void getDataEHora(){
        System.out.println(hora.getHoraAproximada());
        data.mostraData();
    }

}
