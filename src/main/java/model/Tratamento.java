package model;

import java.util.Date;

public class Tratamento {
	private int id;
	private Date data_inicial;
	private Date data_final;
	
	public Tratamento(int id, Date data_inicial, Date data_final) {
		super();
		this.id = id;
		this.data_inicial = data_inicial;
		this.data_final = data_final;
	}

	public int getId() {
		return id;
	}

	public Date getData_inicial() {
		return data_inicial;
	}

	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}

	public Date getData_final() {
		return data_final;
	}

	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}
	
}
