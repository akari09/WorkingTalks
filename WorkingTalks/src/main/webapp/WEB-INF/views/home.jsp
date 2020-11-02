<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Working Talks Login</title>

	<link rel="stylesheet" type="text/css" href="css/common.css">
	<script src="js/jquery-3.4.1.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="custom-js/user-script.js"></script>
    
    
<script type="text/javascript">

$(function() {
	  
	$(".signup").click(function(e) {
		e.preventDefault();
	    
		$(".signup-overlay").toggleClass("is-open");

	});
	
	$(".signup-overlay").click(function(e){
		if($(".signup-overlay").is(e.target)){
			$(".signup-overlay").toggleClass("is-open");
		}
	});
});

</script>
</head>
<body>
	<div class="signin-wrap">
		<div class="signinBox">
			<form action="login" method="post" onsubmit="return login_submit();" style="text-align: center; border-style: solid; width: 400px; height: 300px; vertical-align: middle; margin: auto;">
					<label class="login-title">Working Talks</label><br>
					<input type="text" name="user_id" id="login_id" placeholder="ID (半角英数字 6~14桁)"><br>
					<input type="password" name="user_pw" id="login_pw" placeholder="PW (半角英数字·記号 8~14桁)"><br>
		
					<input type="submit" value="ログイン"><br>
					<input type="button" class="signup" value="会員登録">
			</form>
		</div>
	</div>
	<div class="signup-overlay">
		<div class="signupBox">
			<h1><label>会員登録</label></h1>
			<form action="join" method="post" onsubmit="return check_home()">
			 <table class="signupBox_tbl">
				<tr>
					<td><label>お名前(カナ)*</label></td>
					<td>
						<input type="text" name="user_name" id="user_name" placeholder="全角漢字・カタカナ">
					</td>
				</tr>
				<tr>
					<td><label>ID*</label></td>
					<td><input type="text" name="user_id" id="user_id" placeholder="半角英数字6～14桁"></td>
				</tr>
				<tr>
					<td><label>PW*</label></td>
					<td><input type="text" name="user_pw" id="user_pw" placeholder="半角英数字・記号8～14桁"></td>
				</tr>
				<tr>
					<td><label>PW 再確認*</label></td>
					<td><input type="text" name="user_pw2" id="user_pw2"></td>
				</tr>
				<tr>
					<td><label>会社名*</label></td>
					<td><input type="text" name="user_company" id="user_company"></td>
				</tr>
				<tr>
					<td><label>部署</label></td>
					<td><input type="text" name="user_depart" id="user_depart"></td>
				</tr>
				<tr>
					<td><label>職級</label></td>
					<td><input type="text" name="user_position" id="user_position"></td>
				</tr>
				<tr>
					<td><label>メール*</label></td>
					<td><input type="text" name="mail_addr" id="mail_addr"></td>
				</tr>
			 </table>
			 <input type="submit" value="登録">
			</form>
			<input type="button" class="signup-overlayCancelBtn" value="キャンセル" onclick="JoinExit()">
			
		</div>
	</div>


</body>
</html>
