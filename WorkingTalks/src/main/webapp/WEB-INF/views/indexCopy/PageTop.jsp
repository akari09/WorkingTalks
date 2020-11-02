<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="bootstrap/bootstrap_cerulean.css">
<script src="js/jquery-3.4.1.js"></script>

</head>
<body>

	<div class="bgwrap_top">
		<div class="bg_top"></div>
		<div style="position: absolute; right: 0px; bottom: 0px;">
			<span class="badge badge-pill badge-dark">${sessionScope.loginID }</span>
			<a class="btn btn-outline-primary btn-sm" href="logout">Logout</a>
		</div>
	</div>
</body>
</html>