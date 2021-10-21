package questoes.primeira.b;

public class HoraPrecisa {
    private int horas;
    private int minutos;
    private int segundos;
    private int centesimosDeSegundos;

    private void avisarErroValorInvalido(){
        System.out.println("Valor inválido! item não alterado");
    }

    public String getHoraAproximada(){
        return horas + ":" + minutos + ":" + segundos + ":" + centesimosDeSegundos;
    }

    public HoraPrecisa(int horas, int minutos, int segundos, int centesimosDeSegundos){
        if ((horas <= 23 && horas >= 0) && (minutos <= 60 && minutos >= 0) && (segundos >= 0 && segundos <= 60) && (centesimosDeSegundos >= 0 && centesimosDeSegundos <= 100)){
            this.horas =horas;
            this.minutos = minutos;
            this.segundos = segundos;
            this.centesimosDeSegundos = centesimosDeSegundos;
        }else {
            System.out.println("Valor inválido! valor padrão adicionado.");
            this.horas =0;
            this.minutos = 0;
            this.segundos = 0;
            this.centesimosDeSegundos = 0;
        }
    }
    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 60){
            this.segundos = segundos;
        }else {
            avisarErroValorInvalido();
        }
    }

    public void setCentesimosDeSegundos(int centesimosDeSegundos) {
        if (centesimosDeSegundos >= 0 && centesimosDeSegundos <= 100){
            this.centesimosDeSegundos = centesimosDeSegundos;
        }else {
            avisarErroValorInvalido();
        }
    }

    public void setHoras(int horas) {
        if (horas <= 23 && horas >= 0){
            this.horas = horas;
        }else{
            avisarErroValorInvalido();
        }
    }

    public void setMinutos(int minutos) {
        if (minutos <= 60 && minutos >= 0){
            this.minutos = minutos;
        }else{
            avisarErroValorInvalido();
        }
    }


}
