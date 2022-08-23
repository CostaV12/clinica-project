package model;

public class Cliente {
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private String telefone;
	private String cep;
	private String email;
	
	public Cliente(int id, String cpf, String nome, String endereco, String telefone, String cep, String email) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cep = cep;
		this.email = email;
	}
	
	public int getId() {
		return id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
