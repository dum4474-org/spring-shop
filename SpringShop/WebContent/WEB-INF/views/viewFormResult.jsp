<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uno</title>
</head>
<body>
Resultado formulario Artículo

<br/> Marca: ${articulo.marca}
<br/> Nombre: ${articulo.nombre}
<br/> Precio: ${articulo.precio}
<br/>
<br/> ${message}
<br/><a href="/tienda/formArticulo">Nuevo</a>
</body>
</html>