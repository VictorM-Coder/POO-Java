package questoes.primeira.c;

import questoes.primeira.a.HoraAproximada;
import questoes.primeira.e.DataPrecisa;

/*OBS.: eu instanciei a classe DataSimples aqui em vez de copiar a classe data diretamente para o projeto,
 pois assim os arquivos ficariam mais organizados*/
public class DataHora {
    private HoraAproximada hora;
    private DataPrecisa data;

    public DataHora(HoraAproximada horaAproximada, byte dia, byte mes, short ano){
        this.hora = horaAproximada;
        this.data = new DataPrecisa();
        this.data.inicializaDataSimples(dia, mes, ano);
    }

    /*
    OBS2.: como a classe data foi cedida para modificação seu método de impressão era via "sout", por isso, em vez de
    aplicar o return como saída do método optei por realizar uma impressão também. pois não sabia se podiámos modificar
    mais da classe Data.
     */
    public void getDataEHora(){
        System.out.println(hora.getHoraAproximada());
        data.mostraData();
    }

}
