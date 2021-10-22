package teste01;

import questoes.primeira.a.HoraAproximada;
import questoes.primeira.b.HoraPrecisa;

public class TesteHora {
    public static void main(String[] args) {
        /*HoraAproximada horaAproximada = new HoraAproximada(0, 30);

        System.out.println(horaAproximada.getHoraAproximada());*/

        HoraPrecisa horaPrecisa = new HoraPrecisa(8, 30, 59, 100);
        System.out.println(horaPrecisa.getHoraPrecisa());

    }
}
