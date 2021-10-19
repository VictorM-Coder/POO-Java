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
