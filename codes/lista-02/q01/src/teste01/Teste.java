package teste01;

import dominio.HoraAproximada;

public class Teste {
    public static void main(String[] args) {
        HoraAproximada horaAproximada = new HoraAproximada();
        horaAproximada.setHoras(22);
        horaAproximada.setMinutos(62);
        System.out.println(horaAproximada.getHoraAproximada());

    }
}
