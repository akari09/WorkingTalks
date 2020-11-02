<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Working Talks User Information</title>

<link rel="stylesheet" type="text/css" href="css/common.css">
<script src="js/jquery-3.4.1.js"></script>
<script src="custom-js/user-script.js"></script>

<script>
$(document).ready(function(){

    $.ajax({
        url: "info",
        type: "POST",
        datatype: "json",
        success : function(result){
        	$('#user_name').val(result.user_name);
        	$('#user_id').val(result.user_id);
        	$('#user_company').val(result.user_company);
        	$('#user_depart').val(result.user_depart);
        	$('#user_position').val(result.user_position);
        	$('#mail_addr').val(result.mail_addr);
        },
        error : function(){
            alert("修正されていません。");
        }
    });
})
</script>
</head>
<body>
		<div class="main-contents">
		
				<div class="userinfo_contents">
					<label>登録された会員情報</label>
					<form action="infoUpdate" method="post">
						<table class="userinfo_contents_tbl">
							<tr>
								<td>お名前</td>
								<td><input class="form-control" type="text" name="user_name" id="user_name" readonly="readonly"></td>
							</tr>
							<tr>
								<td>ID</td>
								<td><input class="form-control" type="text" name="user_id" id="user_id" readonly="readonly"></td>
							</tr>
							<tr>
								<td>PW</td>
								<td><input class="form-control" type="text" name="user_pw" id="user_pw" placeholder="半角英数字・記号8～14桁"></td>
							</tr>
							<tr>
								<td>会社名</td>
								<td><input class="form-control" type="text" name="user_company" id="user_company"></td>
							</tr>
							<tr>
								<td>部署</td>
								<td><input class="form-control" type="text" name="user_depart" id="user_depart"></td>
							</tr>
							<tr>
								<td>職級</td>
								<td><input class="form-control" type="text" name="user_position" id="user_position"></td>
							</tr>
							<tr>
								<td>メール</td>
								<td><input class="form-control" type="text" name="mail_addr" id="mail_addr"></td>
							</tr>
						</table>
						<input class="btn btn-primary"　type="submit" value="情報修正" onclick="return check_info()">
					</form>
				</div>
				
		</div>

</body>
</html>