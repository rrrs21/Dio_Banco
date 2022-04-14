package desafio_dio_banco;

import java.util.Scanner;

public class Menu {
	
	int opcao=0;
	String nome="";
	Cliente cliente = new Cliente();
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public Menu(int opcao , Banco banco) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do titular");
		setNome(scan.next());
		this.cliente.setNome(getNome());
		do {
			System.out.println("Digite o codigo do tipo de conta");
			System.out.println("1 - Conta Corrente");
		    System.out.println("2 - Conta Poupanca");
		    opcao = scan.nextInt();

			} while ((opcao<1) |( opcao>2));
		setOpcao(opcao);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Menu(int opcao) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Criar nova conta");
		System.out.println("2 - Imprimir clientes");
		System.out.println("3 - Depositar");
		System.out.println("4 - Sacar");
		System.out.println("5 - Transferir");
		System.out.println("6 - Sair");
		opcao = scan.nextInt();
		setOpcao(opcao);
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	
		
}
