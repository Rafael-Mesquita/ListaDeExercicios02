package Exercicio10;

public class Cliente {
    public String nome;
    public String endereco;
    public int telefone;

    public void imprimiDadosCliente() {
        System.out.println("Nome: " +  this.nome +"\n"+
                "Endereço: " + this.endereco + "\n"+
                "Telefone: " + this.telefone);
    }

}
