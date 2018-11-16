package com.dani.shop.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.dani.shop.model.Articulo;
import com.dani.shop.model.Carrito;
import com.dani.shop.services.IShopService;

@Controller
public class ShopController {

	
//	@ModelAttribute("lista")
//	public List<String> lista() {
//		System.out.println("@ModelAttribute - lista");
//		return Arrays.asList(new String[]{"primero", "segundo", "tercero"});
//	}
//
//	@ModelAttribute("pepe")
//	public String pepe() {
//		System.out.println("@ModelAttribute - pepe");
//		return "Pepito";
//	}

//	@Autowired
//	IShopService shopService;
	
	@Autowired
	Carrito carrito;
	
	@GetMapping("/formArticulo")
	public String form(Model model) {
		System.out.println("---> GET /formArticulo " + carrito.getListaArticulos().toString());
		model.addAttribute("articulo", new Articulo());
		return "viewForm";
	}	

	@PostMapping("/formArticulo")
	public String addArticulo(@Valid @ModelAttribute("articulo") Articulo articulo, BindingResult result, Model model) {
		System.out.println("---> POST /formArticulo - " + articulo.toString());
		System.out.println("---> POST /formArticulo - lista " + carrito.getListaArticulos().toString());
		if (result.hasErrors()) {
			System.out.println("---> POST /formArticulo - Errores en los datos introducidos!");
			model.addAttribute("errorMessage", "Ha habido un error en los datos");
			return "viewForm";
		}
		//shopService.addArticulo(articulo);
		carrito.getListaArticulos().add(articulo);
		System.out.println("---> POST /formArticulo - Datos introducidos correctos!");
		System.out.println("---> POST /formArticulo - lista " + carrito.getListaArticulos().toString());
		model.addAttribute("message", "Se ha creado el artículo " + articulo.toString());
		return "viewFormResult";
	}	

	@RequestMapping("/uno")
	public String uno(Model model) {
		System.out.println("---> /uno");
		model.addAttribute("uno", "1UNO");
		printAttributes("uno", model);
		return "redirect:r-uno";
		//return "uno";
	}	

	@RequestMapping("/r-uno")
	public String r_uno(Model model) {
		System.out.println("---> /r-uno");
		return "uno";
	}	

	@RequestMapping("sub1")
	public String subUno(Model model) {
		return "sub/uno";
	}
	
	private void printAttributes(String quien, Model model) {
		System.out.println("---> print by " + quien);
		for (String key : model.asMap().keySet()) {
			System.out.println("---> " + quien + " - " + key + " : " + model.asMap().get(key) );
		}
	}
}
