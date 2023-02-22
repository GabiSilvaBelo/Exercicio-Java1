package ExerciciosJavaPoo;

public class Cliente {

	// declaração dos atributos da classe
	private String nomeCliente;
	private String endereco;
	private int idade;
	private long telefone;
	private String cpf;


	public Cliente(String nomeCliente, String endereco, int idade, long telefone, String cpf) {
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	// declaração dos demais métodos da classe
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		System.out.println(nomeCliente + " idade: " + idade + ", endereço: " + endereco + ", CPF: " + cpf
				+ " e telefone: " + telefone);
	}

}
