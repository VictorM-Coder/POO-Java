import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo ao nosso sistema dde análise da datas \nVamos começar informando o dia:");
        byte dia = input.nextByte();
        System.out.println("Agora o mês:");
        byte mes = input.nextByte();
        System.out.println("Por fim nos informe o ano");
        Short ano = input.nextShort();


        Data data = new Data(dia, mes, ano);

        System.out.println("----------------------------------------");
        System.out.println("Dia:" + data.getDia());
        System.out.println("Mês:" + "(" + data.getMes() + ")"  + data.getMesExtenso());
        System.out.println("Ano:" + data.getAno());

        if (data.isBissexto()){
            System.out.println("Este é um ano Bissexto");
        }
        System.out.println("----------------------------------------");

        System.out.println("Dejesa criar um nova data?[Para SIM digite 1, e para NÃO entre qualquer outro número]");
        int flag = input.nextInt();
        if (flag == 1){
            System.out.println("Informe o dia:");
            byte dia2 = input.nextByte();
            System.out.println("Agora o mês:");
            byte mes2 = input.nextByte();
            System.out.println("Por fim nos informe o ano");
            Short ano2 = input.nextShort();

            Data data2 = new Data(dia2, mes2, ano2);
        }
        input.close();
    }
}
