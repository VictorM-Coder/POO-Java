import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo ao nosso sistema de análise da datas \nVamos começar informando o dia:");
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
            System.out.println("----------------------------------------");

            System.out.println(data2);
            switch (data2.compara(data)){
                case 1:
                    System.out.println("Esta Data é maior que a primeira");
                    break;
                case 0:
                    System.out.println("Esta data é igual a primeira");
                    break;
                case -1:
                    System.out.println("Esta data é menor que a primeira");
                    break;
            }
        }

        System.out.println("----------------------------------------");
        System.out.println("Deseja criar um clone da primeira data?[Para SIM digite 1, e para NÃO entre qualquer outro número]");
        int flag2 = input.nextInt();

        if (flag2 == 1){
            Data dataClonada = data.clone();
            System.out.println("Data Clonada com sucesso! \n" + dataClonada);
        }
        System.out.println("----------------------------------------");

        System.out.println("Fim do programa, obrigado pelo uso :)");
        input.close();
    }
}
