public class NumeroComplexo {
    private double a;//parte real
    private double b;//parte imaginária sem o complexo puro
    private String bi;//número complexo puro

    public void inicializaNumero(double a, double b){
        this.a = a;
        this.b = b;
        this.bi = "(" + b + "i)";
    }

    public void imprimeNumero(){
        System.out.println(this.a + " + " + this.bi);
    }

    public boolean ehIgual(NumeroComplexo numeroComplexo){
        if (this.a == numeroComplexo.a && this.b == numeroComplexo.b){
            return true;
        }else{
            return false;
        }
    }

    public NumeroComplexo soma(NumeroComplexo num2){
        double aSaida = this.a + num2.a;
        double bSaida = this.b + num2.b;

        NumeroComplexo numeroSoma = new NumeroComplexo();
        numeroSoma.inicializaNumero(aSaida, bSaida);
        return numeroSoma;
    }

    public NumeroComplexo subtrai(NumeroComplexo num2){
        double aSaida = this.a - num2.a;
        double bSaida = this.b - num2.b;

        NumeroComplexo numeroSubtracao = new NumeroComplexo();
        numeroSubtracao.inicializaNumero(aSaida, bSaida);
        return numeroSubtracao;
    }

    public NumeroComplexo multiplica(NumeroComplexo num2){
        double aSaida = (this.a * num2.a) - (this.b * num2.b);
        double bSaida = (this.a * num2.b) + (this.b * num2.a);

        NumeroComplexo numeroMultiplicado = new NumeroComplexo();
        numeroMultiplicado.inicializaNumero(aSaida, bSaida);
        return numeroMultiplicado;
    }

    public NumeroComplexo divide(NumeroComplexo num2){
        double aSaida = ((this.a * num2.a) + (this.b * num2.b)) / (Math.pow(num2.a, 2) + Math.pow(num2.b, 2));
        double bSaida = (this.b * num2.a) - (this.a * num2.b) / (Math.pow(num2.a, 2) + Math.pow(num2.b, 2));

        NumeroComplexo numeroResultado = new NumeroComplexo();
        numeroResultado.inicializaNumero(aSaida, bSaida);
        return numeroResultado;
    }
}
