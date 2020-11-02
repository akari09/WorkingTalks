<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Working Talks User Search</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="custom-js/user-script.js"></script>
</head>
<body>
		<div class="main-contents">
		
			<div class="usersearch_contents">
			<br>
					<label><h3>検索条件</h3></label>
					<form action="usersearch" method="post">
						<table class="usersearch_contents_tbl table table-hover">
							<thead>
								<tr>
									<td><input class="form-control" type="text" name="searchText" id="searchText"></td>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
										<input class="btn btn-outline-primary" type="submit" value="検索">
										<input class="btn btn-outline-primary" type="button" value="リセット" onclick="reset()">
									</td>
								</tr>
							</tbody>
						</table>
					</form>
				</div>
				<br>
				<div class="searchresult_contents">
					<label>検索結果</label>
						<table class="usersearch_contents_tbl table table-hover">
							<thead>
								<tr>
									<td>氏名</td>
									<td>ID</td>
									<td>会社名</td>
									<td>部署</td>
									<td>職級</td>
									<td>メール</td>
								</tr>
							</thead>
							<tbody>
							 <c:if test="${not empty searchResult}">
							  <c:forEach items="${searchResult }" var="searchResult">
								<tr>
									<td>${searchResult.user_name }</td>
									<td>${searchResult.user_id }</td>
									<td>${searchResult.user_company }</td>
									<td>${searchResult.user_depart }</td>
									<td>${searchResult.user_position }</td>
									<td>${searchResult.mail_addr }</td>
								</tr>
							  </c:forEach>
							 </c:if>
							 <c:if test="${empty searchResult}">
							 	<tr>
							 		<td colspan="6">
							 			<h5 align="center">検索結果はありません。</h5>
							 		</td>
							 	</tr>
							 </c:if>

							</tbody>
						</table>
				</div>
		
		</div>

</body>
</html>