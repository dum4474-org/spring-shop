package com.dani.shop.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Articulo implements Serializable {

	private static final long serialVersionUID = -5777693475388472109L;

	@NotNull @Size(min=1, max=30)
	private String marca;

	@NotNull @Size(min=1, max=30)
	private String nombre;

	@NotNull @Min(1) @Max(5000)
	private BigDecimal precio;
	
	public Articulo() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulo [marca=" + marca + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
