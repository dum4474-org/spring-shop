<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

	<meta charset="UTF-8">

	<title>Uno</title>
	
	<style type="text/css">
	
		.col1 {
			display: inline-block;
			width: 75px;
			text-align: right;
		}

		.col2 {
			display: inline-block;
			width: 250px;
		}

		.col3 {
			display: inline-block;
			width: 100px;
		}
		
		.inputError {
			background-color: #F99;
		}
	
		.messageError {
			color: red;
		}
		
		.errorBox {
			display: inline-block;
			width: auto;
			padding: 5px;
			border-style: solid;
    		border-width: 2px;
    		border-color: #d00;
    		color: #d00;
    		background-color: #F99;
		}
	</style>

</head>

<body>
FORMULARIO ARTÍCULOS

<form:form method="POST" modelAttribute="articulo">
	<br/><form:label path="marca" cssClass="col1">Marca</form:label> <form:input path="marca" cssClass="col2" cssErrorClass="col2 inputError"/> <form:errors path="marca" cssClass="messageError" />
	<br/><form:label path="nombre" cssClass="col1">Nombre</form:label> <form:input path="nombre" cssClass="col2" cssErrorClass="col2 inputError"/> <form:errors path="nombre" cssClass="messageError" />
	<br/><form:label path="precio" cssClass="col1">Precio</form:label> <form:input path="precio" cssClass="col2" cssErrorClass="col2 inputError"/> <form:errors path="precio" cssClass="messageError" />
	<br/>
	
	<c:if test="${not empty errorMessage}">
		<br/>
		<div class="errorBox">${errorMessage}</div>
		<br/>
	</c:if>
	
	<br/><input type="submit" />
</form:form>

<br/> lista - ${carrito.getListaArticulos().size()}
<c:forEach items="${carrito.getListaArticulos()}" var="unArticulo">
	<br/> - ${unArticulo.toString()} 
</c:forEach>


</body>
</html>