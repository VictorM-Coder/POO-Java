package teste01;

import questoes.quinta.c.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        /* empregadoA = new Empregado("João", "TI", 40, 2.5f);

        System.out.println(empregadoA.mostraDados());
        System.out.println(empregadoA.calcularSalarioMensal());*/

        /*Empregado empregadoB = new Empregado("Carlos", "RE", 50, 8, 2.5f, 3);

        System.out.println(empregadoB.mostraDados());
        System.out.println(empregadoB.calcularSalarioMensal());*/

        Empregado empregadoC = new Empregado("pedro", "Diretoria", 50, 10, 2, 5);

        System.out.println(empregadoC.mostraDados());
        System.out.println(empregadoC.calcularSalarioMensal());
    }
}
