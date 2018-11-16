package com.dani.shop.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrito implements Serializable {

	private static final long serialVersionUID = 3276846477904028123L;

	private List<Articulo> listaArticulos = new ArrayList<>();
	
	public Carrito() {}

	public List<Articulo> getListaArticulos() {
		return listaArticulos;
	}

	public void setListaArticulos(List<Articulo> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
}
