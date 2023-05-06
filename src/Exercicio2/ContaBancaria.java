package Exercicio2;

public class ContaBancaria {
    public double saldo;
    public String titular;

    public void sacarDinheiro(double valorSacado) {
        this.saldo -= valorSacado;
    }
    public void depositarDinheiro(double valorDepositado) {
        this.saldo += valorDepositado;
    }
}