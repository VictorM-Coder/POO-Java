import java.util.Locale;
import java.util.Scanner;

public class TesteNumeroComplexo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a1, a2, b1, b2;
        byte operacao;
        NumeroComplexo numero1 = new NumeroComplexo();
        NumeroComplexo numero2 = new NumeroComplexo();
        NumeroComplexo numeroResultadoOperacao = new NumeroComplexo();

        System.out.println("Seja bem-vindo à calculadora de números complexos!\ndê entrada no primeiro número");
        System.out.print("a: ");
        a1 = input.nextDouble();
        System.out.print("b: ");
        b1 = input.nextDouble();
        System.out.println("---------------------------------");

        numero1.inicializaNumero(a1, b1);
        System.out.println("Novo número criado com sucesso!");
        numero1.imprimeNumero();
        System.out.println("---------------------------------");

        System.out.println("dê entrada no segundo número");
        System.out.print("a: ");
        a2 = input.nextDouble();
        System.out.print("b: ");
        b2 = input.nextDouble();
        System.out.println("---------------------------------");

        numero2.inicializaNumero(a2, b2);
        System.out.println("Novo número criado com sucesso!");
        numero2.imprimeNumero();
        System.out.println("---------------------------------");

        if (numero1.ehIgual(numero2)){
            System.out.println("Aviso: os números são iguais");
            System.out.println("---------------------------------");
        }

        System.out.println("Qual operação deseja realizar entre estes números? (digite o número correpondente)");
        System.out.println("[1]Soma [2]Subtração [3]Multiplicação [4]Divisão [Outro]Cancela o programa");
        operacao = input.nextByte();

        switch (operacao){
            case 1:
                numeroResultadoOperacao = numero1.soma(numero2);
                break;
            case 2:
                numeroResultadoOperacao = numero1.subtrai(numero2);
                break;
            case 3:
                numeroResultadoOperacao = numero1.multiplica(numero2);
                break;
            case 4:
                numeroResultadoOperacao = numero1.divide(numero2);
                break;
            default:
                System.out.println("Programa Finalizado!");
                System.exit(0);
                break;
        }

        System.out.println("---------------------------------");
        System.out.println("resultado: ");
        numeroResultadoOperacao.imprimeNumero();
        System.out.println("---------------------------------");
        System.out.println("Fim do programa...");

        input.close();
    }
}
