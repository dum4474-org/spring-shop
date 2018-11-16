package com.dani.shop.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.dani.shop.model.Articulo;

@Service
public class ShopServiceImpl implements IShopService {
	
	private List<Articulo> listaArticulos = new ArrayList<Articulo>();

	public ShopServiceImpl() {
	}

	@Override
	public void addArticulo(Articulo articulo) {
		System.out.println("ShopServiceImpl --> addArticulo " + articulo.toString());
		listaArticulos.add(articulo);
	}

	@Override
	public void removeArticulo(String idArticulo) {
	}

	@Override
	public Articulo getArticulo(String idArticulo) {
		return listaArticulos.get(listaArticulos.size() - 1);
	}

	@Override
	public List<Articulo> getArticulos() {
		return listaArticulos;
	}

}
