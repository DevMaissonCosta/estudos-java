package POO.entities;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    public double salariobruto() {
        return salario - imposto;
    }

    public double AumentoSalario(double porcentagem) {
       return salario += salario * porcentagem / 100.0;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f", salariobruto());
    }


}
