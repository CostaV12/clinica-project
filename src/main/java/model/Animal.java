package model;

public class Animal {
	private int id;
	private String nome;
	private int idade;
	private char sexo;
	private String especie;
	
	public Animal(int id, String nome, int idade, char sexo, String especie) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.especie = especie;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	
}


