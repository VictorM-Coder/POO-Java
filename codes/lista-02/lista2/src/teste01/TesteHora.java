package teste01;

import questoes.primeira.a.HoraAproximada;

public class TesteHora {
    public static void main(String[] args) {
        HoraAproximada horaAproximada = new HoraAproximada();
        horaAproximada.setHoras(22);
        horaAproximada.setMinutos(62);
        System.out.println(horaAproximada.getHoraAproximada());

    }
}
