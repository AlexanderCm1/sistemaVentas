package com.example.sysventas_EternalBlue.entity;

public class Ventas {
	private int idventas;
	private String fecha;
	private String tipodoc;
	private String numdoc;
	private int idpersona;
	public Ventas(int idventas, String fecha, String tipodoc, String numdoc, int idpersona) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
	}
	public Ventas() {
		super();
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

}
