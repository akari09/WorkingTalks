<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Working Talks User Information</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<link rel="stylesheet" type="text/css" href="bootstrap/bootstrap_cerulean.css">
<script src="js/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	var userCode = $("#user_cd").val();
	
	$.ajax({
		url: "userlist",
		data: {user_cd : userCode},
		type: "POST",
		success : function(result){
			alert("목록 불러오기 성공");
			displayList(result);
		},
		error : function(){
			alert("목록 불러오기 실패");
		}
	});
})

function displayList(result){
	$.each(result, function(index, item){
		var str = "<tr><td>" + item.user_name + "</td>";
		str += "<td>" + item.user_id + "</td>";
		str += "<td>" + item.user_company + "</td>";
		str += "<td>" + item.user_depart + "</td>";
		str += "<td>" + item.user_position + "</td>";
		str += "<td>" + item.mail_addr + "</td></tr>";
		
		$("tbody").append(str);
	});
}

</script>
</head>
<body>
		<div class="main-contents">
		
			<div class="userlist_contents">
					<label>よく訪れる目録</label>
					<form action="">
						<table class="userlist_contents_tbl table table-hover">
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
							</tbody>
						</table>
					</form>
				</div>
		
		</div>

	<input type="hidden" id="user_cd" value="${sessionScope.loginCode }">
</body>
</html>