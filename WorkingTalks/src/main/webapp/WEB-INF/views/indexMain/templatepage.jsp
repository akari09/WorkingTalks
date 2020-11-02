<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Working Talks Main</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<script src="js/jquery-3.4.1.js"></script>


</head>
<body>
	<%
        String select = request.getParameter("pageChange");
 
        if (select == null) {
            select = "LoginCompMain.jsp";
        }
    %>
	<jsp:include page="../indexCopy/PageTop.jsp" flush="false"></jsp:include>

	<div>
		<jsp:include page="../indexCopy/PageLeft.jsp" flush="false"></jsp:include>
		<jsp:include page="<%=select%>" flush="false"></jsp:include>
	</div>

</body>
</html>