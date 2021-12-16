import agencia.Conta;
import agencia.Label;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solver{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta(0);
        while(true){
            String line = scanner.nextLine();
            System.out.println("$" + line);
            List<String> ui = Arrays.asList(line.split(" "));
            if(line.equals("end")) {
                break;
            } else if(ui.get(0).equals("show")) {
                System.out.println(conta);
            } else if(ui.get(0).equals("init")) {
                conta = new Conta(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("saque")) {
                conta.sacar(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("tarifa")) {
                conta.tarifar(Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("deposito")) {
                conta.creditar(Label.DEPOSITO, Integer.parseInt(ui.get(1)));
            } else if(ui.get(0).equals("extornar")) {
                final Conta aux = conta;
                ui.stream().skip(1).forEach(index -> aux.extornar(Integer.parseInt(index)));
            } else if(ui.get(0).equals("extrato")) {
                conta.getFinancas().getExtrato().forEach(System.out::println);
            } else if(ui.get(0).equals("extratoN")) {
                conta.getFinancas().getExtrato(Integer.parseInt(ui.get(1))).forEach(System.out::println);
            } else {
                System.out.println("fail: comando invalido");
            }
        }
        scanner.close();
    }
}