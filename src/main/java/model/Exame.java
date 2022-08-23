package model;

public class Exame {
	private int id;
	private String nome;
	private String descExame;
	
	public Exame(int id, String nome, String descExame) {
		super();
		this.id = id;
		this.nome = nome;
		this.descExame = descExame;
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

	public String getDescExame() {
		return descExame;
	}

	public void setDescExame(String descExame) {
		this.descExame = descExame;
	}
	
	
	
}
