package banco;

import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
		Conta a = new Conta("Conta 1");
		Conta b = new Conta("Conta 2");
		System.out.println(a.toString());
		a.depositar(100);
		System.out.println(a.toString());
		a.sacar(150);
		a.sacar(50);
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}

