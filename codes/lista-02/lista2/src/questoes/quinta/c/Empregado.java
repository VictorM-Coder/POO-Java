package questoes.quinta.c;

public class Empregado {
    private String nome;
    private String departamento;
    private int horasNormaisTrabalhadasNoMes;
    private int horasExtrasTrabalhadasNoMes;

    private float salarioPorHoraNormal;
    private float salarioPorHoraExtra;

    public Empregado(String nome, String departamento, int horasNormaisTrabalhadasNoMes, int horasExtrasTrabalhadasNoMes, float salarioPorHoraNormal, float salarioPorHoraExtra) {
        this.nome = nome;
        this.departamento = departamento;
        this.horasNormaisTrabalhadasNoMes = horasNormaisTrabalhadasNoMes;
        this.horasExtrasTrabalhadasNoMes = horasExtrasTrabalhadasNoMes;
        this.salarioPorHoraNormal = salarioPorHoraNormal;
        this.salarioPorHoraExtra = salarioPorHoraExtra;
    }

    public String mostraDados(){
        return "Nome: " + this.nome + ", Departamento: " + this.departamento + ", Horas trabalhadas no mês: "
                + this.horasNormaisTrabalhadasNoMes+ ", Salário por hora normal: " + this.salarioPorHoraNormal +
                ", Horas Extras: " + this.horasExtrasTrabalhadasNoMes + ", Valor hora extra: " + this.salarioPorHoraExtra;
    }

    public float calcularSalarioMensal(){
        float salario =  (this.horasNormaisTrabalhadasNoMes * this.salarioPorHoraNormal) + (this.salarioPorHoraExtra * this.horasExtrasTrabalhadasNoMes);
        if (this.departamento.equals("Diretoria")){
            salario+= salario*0.1;
        }
        return salario;
    }
}
