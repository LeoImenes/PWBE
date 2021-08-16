<%@page import="vo.Product"%>
<%@page import="ctr.ProductsProcess"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Produtos (READ)</title>
</head>
<body>
	<table>
	<%
		ProductsProcess.testes();
		for(Product p: ProductsProcess.products){
			out.print(p.toHTML());
		}
		out.print(ProductsProcess.salvar());
	%>
	</table>
</body>
</html>