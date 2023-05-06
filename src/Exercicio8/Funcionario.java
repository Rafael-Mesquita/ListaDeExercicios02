package Exercicio8;

public class Funcionario {
    public String nome;
    public String cargo;
    public double salario;

    public void imprimiDadosFuncionario() {
        System.out.println("Nome: " +  this.nome +"\n"+
                "Cargo: " + this.cargo + "\n"+
                "Salário: " + this.salario);
    }

}