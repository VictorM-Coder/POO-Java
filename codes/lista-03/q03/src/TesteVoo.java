import java.util.Scanner;

public class TesteVoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data dataVoo;
        Voo voo;

        System.out.println("Seja bem-vindo ao sistema do Aeroporto, capitão \nVamos iniciar o cadastro de um novo voo");
        System.out.print("número do voo: ");
        int id = input.nextInt();

        System.out.println("--------------------------");
        System.out.println("informações da Data:");
        System.out.print("Dia: ");
        byte dia = input.nextByte();
        System.out.print("Mês: ");
        byte mes = input.nextByte();
        System.out.print("Ano: ");
        short ano = input.nextShort();
        System.out.println("--------------------------");

        dataVoo = new Data(dia, mes, ano);
        voo = new Voo(id, dataVoo);
        System.out.println("Novo voo cadastrado!");

        System.out.println("--------------------------");
        System.out.println("Voo: " + voo.getVoo() + "\n" + voo.getData());
        System.out.println("--------------------------");

        System.out.println("Iniciando cadastro dos passageiros...");
        System.out.println("ATENÇÃO: as cadeiras são nomeadas com valores entre 0 e 99!");

        System.out.println("--------------------------");
        boolean continuarCadastro = true;
        while (continuarCadastro){
            System.out.println("Vagas Disponíveis: [" + voo.vagas() + "/100]");
            System.out.println("A próxima cadeira livre é: [" + voo.proximoLivre() + "]");

            System.out.print("Ocupar cadeira número: ");
            int numCadeiraParaOcupar = input.nextInt();

            if (voo.ocupa(numCadeiraParaOcupar)){
                System.out.println("Cadeira ocupada com sucesso!");
            }else if (numCadeiraParaOcupar >= 0 && numCadeiraParaOcupar <= 99){
                System.out.println("esta cadeira já está ocupada");
            }

            System.out.print("Deseja continuar o cadastro? [digite 1 para SIM e qualquer outro número para NÃO]");
            int continuar = input.nextInt();
            continuarCadastro = (continuar == 1)? true: false;
            System.out.println("--------------------------");
        }

        System.out.println("Cadastro Terminado.");
        System.out.println("--------------------------");

        System.out.println("Ficha do voo\n" + voo);
        System.out.println("--------------------------");

        System.out.print("Deseja criar uma cópia para esses dados([1]SIM [outro número]NÃO)? ");
        int flagClone = input.nextInt();
        System.out.println("--------------------------");

        Voo vooCopia;
        if (flagClone == 1){
            vooCopia = voo.clone();
            System.out.println("Informações copiadas com sucesso!");
            System.out.println("--------------------------");
        }

        System.out.println("Fim da operação. Tenha um bom dia!");
        input.close();
    }
}
