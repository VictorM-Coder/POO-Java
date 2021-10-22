package questoes.primeira.a;

public class HoraAproximada {
    private int horas;
    private int minutos;

    private void avisarErroValorInvalido(){
        System.out.println("Valor inválido! item não alterado");
    }

    public String getHoraAproximada(){
        return this.horas + ":" + this.minutos;
    }
    public HoraAproximada(int horas, int minutos){
        if ((horas <= 23 && horas >= 0) && (minutos <= 59 && minutos >= 0)){//verifica se o valores estão em um intervalo válido
            this.horas =horas;
            this.minutos = minutos;
        }else {
            System.out.println("Valor inválido! valor padrão adicionado.");
            this.horas =0;
            this.minutos =0;
        }
    }

    //métodos setters
    public void setHoras(int horas) {
        if (horas <= 23 && horas >= 0){
            this.horas = horas;
        }else{
            avisarErroValorInvalido();
        }
    }

    public void setMinutos(int minutos) {
        if (minutos <= 59 && minutos >= 0){
            this.minutos = minutos;
        }else{
            avisarErroValorInvalido();
        }
    }


}
