package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;
import br.senai.sp.jandira.model.Cliente;

public class App {

	public static void main(String[] args) {

		
		Conta contaDaAna = new Conta();
		Conta contaDoJoao = new Conta();
		
		//contaDaAna.setTitular("Ana Gomes");
		contaDaAna.setNumero("111-98");
		contaDaAna.setTipo("Poupan�a");
		contaDaAna.setAtiva(true);
		contaDaAna.setChequeEspecial(200);
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(30);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(500);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(50);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.sacar(80);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.depositar(100);
		contaDaAna.mostrarSaldoDaConta();
		contaDaAna.getSaldo();
		
		//System.out.println("Nome: "+ contaDaAna.getTitular());
		System.out.println("Tipo: "+ contaDaAna.getTipo());
		System.out.println("Conta: "+ contaDaAna.getNumero());
		System.out.println("Limite: "+ contaDaAna.getChequeEspecial());
		
		Cliente cliente = new Cliente ();
		
		
		// *** Conta Jo�o
		//contaDoJoao.setTipo("Corrente");
		//�rea � a base * altura
		//per�metro 2 (b + alt) faz distributiva e GG
	}
}
