package desafio_dio_banco;

import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	protected void imprimirClientes() {
		for (int i=0; i<contas.size();i++) {
			Conta cc = (Conta) contas.get(i);
			System.out.println(String.format("Cliente: %s", cc.cliente.getNome()));
			System.out.println(String.format("Saldo: %.2f", cc.getSaldo()));
		}
		
	}
		
}
