package questoes.quinta.a;

public class Empregado {
    private String nome;
    private String departamento;
    private int horasTrabalhadasNoMes;
    private float salarioPorHora;

    public Empregado(String nome, String departamento, int horasTrabalhadasNoMes, float salarioPorHora) {
        this.nome = nome;
        this.departamento = departamento;
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
        this.salarioPorHora = salarioPorHora;
    }

    public String mostraDados(){
        return "Nome: " + this.nome + ", Departamento: " + this.departamento + ", Horas trabalhadas no mês: "
                + this.horasTrabalhadasNoMes + ", Salário por hora: " + this.salarioPorHora;
    }

    public float calcularSalarioMensal(){
        return this.horasTrabalhadasNoMes * this.salarioPorHora;
    }
}
