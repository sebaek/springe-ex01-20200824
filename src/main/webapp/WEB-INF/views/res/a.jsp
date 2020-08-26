<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://kit.fontawesome.com/a076d05399.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script>
$(function() {
	$("#btn-b").click(function() {
		$("#result-b").load("/res/b");
	});
	
	$("#btn-c").click(function() {
		$("#result-c").load("/res/c");
	})
	
	$("#btn-d").click(function() {
		$("#result-d").load("/res/d");
	})
	
	$("#btn-e").click(function() {
		$("#result-e").load("/res/e");
	})
})
</script>
<title>Insert title here</title>
</head>
<body>
<h1>a.jsp </h1>
<button id="btn-b">load b</button>
<h2 id="result-b"></h2>

<button id="btn-c">load c</button>
<ol id="result-c"></ol>

<button id="btn-d">load d</button>
<p id="result-d"></p>

<button id="btn-e">load e</button>
<p id="result-e"></p>
</body>
</html>







