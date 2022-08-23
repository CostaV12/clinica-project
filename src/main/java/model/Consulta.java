package model;

import java.util.Date;

public class Consulta {
	private int id;
	private Date dataConsulta;
	private String consulta;
	
	public Consulta(int id, Date dataConsulta, String consulta) {
		super();
		this.id = id;
		this.dataConsulta = dataConsulta;
		this.consulta = consulta;
	}
	
	public int getId() {
		return id;
	}
	public Date getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public String getConsulta() {
		return consulta;
	}
	public void setConsulta(String consulta) {
		this.consulta = consulta;
	}
	
	
}
