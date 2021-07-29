package modelos;

public class Conta {
	float saldo;
	String conta;
	
	public Conta(String conta) {
		saldo = 0;
		this.conta = conta;
	}
	
	public void depositar(float deposito) {
		saldo += deposito;
	}
	
	public void sacar(float saque) {
		if(saque > saldo) {
			System.out.println("Erro! Saldo insuficiente.");
		}else {
			saldo -= saque;
		}
	}
	
	public String toString() {
		return "Saldo:"+saldo;
	}
}
