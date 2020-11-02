<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<script src="js/jquery-3.4.1.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$(".hover-menu").hover(function(){
		$("#sliding-menu", this).stop().slideDown(600, "swing");
	},function(){
		$("#sliding-menu", this).stop().slideUp(600, "swing");
	});
})

</script>

</head>
<body>


<div class="main-menu">
			<div class="hover-menu">
				<div class="hover-menu_lbl">
					<label>会員管理</label><br>
				</div>
				<div id="sliding-menu">
					<div class="sub-menu1">
						<a href="?pageChange=userPage/UserInfo.jsp">会員情報</a><br>
					</div>
					<div class="sub-menu1">
						<a href="?pageChange=userPage/UserSearch.jsp">会員検索</a><br>
					</div>
					<div class="sub-menu1">
						<a href="?pageChange=userPage/UserList.jsp">会員目録</a><br>
					</div>
				</div>
			</div>
			<div class="calendar-menu">
				<a href="?pageChange=calendarPage/MyCalendar.jsp"><label>日程管理</label></a><br>
			</div>
			<div class="chat-menu">
				<a href="?pageChange=chatPage/ChattingList.jsp"><label>チャット</label></a><br>
			</div>
		</div>


</body>
</html>