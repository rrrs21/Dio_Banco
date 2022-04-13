package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Cliente roberto = new Cliente();
		roberto.setNome("Roberto");
		int opcao;
		
	//	Conta cc = new ContaCorrente(roberto);
	//	Conta poupanca = new ContaPoupanca(roberto);
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<Conta>();
	//	cc.depositar(100);
//		cc.transferir(20,  poupanca);
	//	cc.imprimirExtrato();
//		contas.add(cc);
	//	contas.add(poupanca);
//		banco.setContas(contas);
//		poupanca.imprimirExtrato();
	//	banco.imprimirClientes();
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Criar nova conta");
		System.out.println("2 - Imprimir clientes");
		opcao = scan.nextInt();
		menu(opcao,contas,banco);

	}
	private static 
	void menu (int opcao , List<Conta> contas, Banco banco) 
	{
		Scanner scan = new Scanner(System.in);
		String nome = new String("");
		
		int i;
		switch (opcao) 
		{
		    case 1: nome = scan.next();
		    		 Cliente cliente = new Cliente();
		    		 cliente.setNome(nome);
		    		 do {
		    			 System.out.println("Digite o código do tipod e conta");
		    			 System.out.println("1 - Conta Corrente");
		    			 System.out.println("2 - Conta Poupança");
		    			 i = scan.nextInt();
		    			 if (i==1) { 
		    				 Conta cc = new ContaCorrente(cliente);
		    				 contas.add(cc);
		    			 	}
		    			 else {if (i==2) 
		    			 		{ 
		    				 		Conta poupanca = new ContaPoupanca(cliente);
		    				 		contas.add(poupanca);
		    				 	}
		    			 	}
		    			 } while ((i<1) |( i>2));
		    		 break;
		    
		    case 2: banco.imprimirClientes();
		    	 	break;
		    default:
		    throw new IllegalArgumentException("Unexpected value: " + opcao);
	}
	}

}
