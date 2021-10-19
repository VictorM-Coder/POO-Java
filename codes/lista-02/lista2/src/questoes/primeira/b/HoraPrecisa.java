package questoes.primeira.b;

public class HoraPrecisa {
    private int horas;
    private int minutos;
    private int segundos;
    private int centesimosDeSegundos;
    //adicionar construtor
    private void avisarErroValorInvalido(){
        System.out.println("Valor inválido! item não alterado");
    }

    public String getHoraAproximada(){
        return horas + ":" + minutos + ":" + segundos + ":" + centesimosDeSegundos;
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
