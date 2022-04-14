package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao=0, indice = 0, indiceDestino = 0;
		String nome, destino; 
		double valor;
		Banco banco = new Banco();
		List<Conta> contas = new ArrayList<Conta>();
		Map<String,String> indiceContas = new HashMap<String, String>();
		do
		{
			Menu tela = new Menu(opcao);
			opcao = tela.getOpcao();
			switch (opcao) {
			case 1: 
					Menu tipoConta = new Menu(opcao,banco);
					if (tipoConta.getOpcao()==1){
						Conta cc = new ContaCorrente(tipoConta.getCliente());
						contas.add(cc);
						indiceContas.put(cc.getCliente().getNome(),cc.toString() );
					} else {
						if (tipoConta.getOpcao()==2) {
							Conta poupanca = new ContaPoupanca(tipoConta.getCliente());
							contas.add(poupanca);
							indiceContas.put(poupanca.getCliente().getNome(), poupanca.toString());
							}
						}
					break;
			case 2: banco.setContas(contas);
					banco.imprimirClientes();
					break;
			case 3:
					System.out.println("Digite o nome do titular");
					nome=scan.next();
					indice = Integer.parseInt(indiceContas.get(nome))-1;
					System.out.println("Digite o valor a depositar");
					valor=scan.nextDouble();
					contas.get(indice).depositar(valor);
					break;
			case 4:
					System.out.println("Digite o nome do titular");
					nome=scan.next();
					indice = Integer.parseInt(indiceContas.get(nome))-1;
					System.out.println("Digite o valor a sacar");
					valor=scan.nextDouble();
					contas.get(indice).sacar(valor);
					break;
					
			case 5:
					System.out.println("Digite o nome do titular de origem");
					nome=scan.next();
					indice = Integer.parseInt(indiceContas.get(nome))-1;
					System.out.println("Digite o nome do titular de destino");
					destino=scan.next();
					indiceDestino = Integer.parseInt(indiceContas.get(destino))-1;
					System.out.println("Digite o valor a depositar");
					valor=scan.nextDouble();
					contas.get(indice).transferir(valor, contas.get(indiceDestino));
					break;
			
			} 
		} while (opcao!=6);
	}
}