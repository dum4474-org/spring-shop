package com.dani.shop.services;

import java.util.List;

import com.dani.shop.model.Articulo;

public interface IShopService {

	public void addArticulo(Articulo articulo);
	
	public void removeArticulo(String idArticulo);
	
	public Articulo getArticulo(String idArticulo);

	public List<Articulo> getArticulos();
}
