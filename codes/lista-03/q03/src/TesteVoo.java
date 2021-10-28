import java.util.Scanner;

public class TesteVoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data dataVoo;
        Voo voo;

        System.out.println("Seja bem-vindo ao sistema do Aeroporto, capitão1 \n Vamos iniciar o cadastro de um novo voo");
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
        System.out.println(voo.getVoo() + "\n" + voo.getData());
        System.out.println("--------------------------");

        System.out.println("Iniciando cadastro dos passageiros...");
        boolean continuarCadastro = true;
        while (continuarCadastro){
            System.out.println("Vagas Disponíveis: [" + voo.vagas() + "/100]");
            System.out.println("A próxima cadeira livre é: " + voo.proximoLivre());

            System.out.print("[valores entre 0-99]Ocupar cadeira número: ");
            int numCadeiraParaOcupar = input.nextInt();

            if (voo.ocupa(numCadeiraParaOcupar)){
                System.out.println("Cadeira ocupada com sucesso!");
            }else{
                System.out.println("esta cadeira já está ocupada");
            }

            System.out.print("Deseja continuar o cadastro? [digite 1 para SIM e qualquer outro número para NÃO]");
            int continuar = input.nextInt();
            continuarCadastro = (continuar == 1)? true: false;
            System.out.println("--------------------------");
        }
        input.close();
    }
}
