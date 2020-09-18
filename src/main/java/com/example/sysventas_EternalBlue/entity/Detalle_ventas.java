package com.example.sysventas_EternalBlue.entity;

public class Detalle_ventas {
	private int iddetalle_ventas;
	private Double precio;
	private int cantidad;
	private Double subtotal;
	private int idventas;
	private int idproducto;
	public Detalle_ventas(int iddetalle_ventas, Double precio, int cantidad, Double subtotal, int idventas,
			int idproducto) {
		super();
		this.iddetalle_ventas = iddetalle_ventas;
		this.precio = precio;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idventas = idventas;
		this.idproducto = idproducto;
	}
	public Detalle_ventas() {
		super();
	}
	public int getIddetalle_ventas() {
		return iddetalle_ventas;
	}
	public void setIddetalle_ventas(int iddetalle_ventas) {
		this.iddetalle_ventas = iddetalle_ventas;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	
	
}
