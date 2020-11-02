//home.jsp btnFunction 1
function login_submit() {
	var id = $('#login_id').val();
	var pw = $('#login_pw').val();
	
	if (id = '' || pw == '') {
		alert("ID又はPWを入力してください。");
		return false;
	}
}

//home.jsp btnFunction 2
function JoinExit(){
//	location.href="http://localhost:8888/wkts";
	$(".signup-overlay").click(function(e){
		if($(".signup-overlayCancelBtn").is(e.target)){
			$(".signup-overlay").removeClass("is-open");
		}
	});
}

//home.jsp チェック用
function check_home() {
	var user_cd = document.getElementById("user_cd");
	var user_name = document.getElementById("user_name");
	var user_id = document.getElementById("user_id");
	var user_pw = document.getElementById("user_pw");
	var user_pw2 = document.getElementById("user_pw2");
	var user_company = document.getElementById("user_company");
	var user_depart = document.getElementById("user_depart");
	var user_position = document.getElementById("user_position");
	var mail_addr = document.getElementById("mail_addr");
	
	if(6 > user_id.value.length || user_id.value.length > 14){
		alert('IDを正しい桁数で再度入力してください。');
		user_id.focus();
		user_id.select();
	    return false;
	}
	if(8 > user_pw.value.length || user_pw.value.length > 14){
		alert('パスワードを正しい桁数で再度入力してください。');
		user_pw.focus();
		user_pw.select();
	    return false;
	}
	if (user_pw.value != user_pw2.value){
		alert('パスワードを正しい内容で再度入力してください。');
	    return false;
	}
	if(user_name.value.length == 0){
		alert('お名前は必須項目です。入力を確認してください。');
		user_name.focus();
		user_name.select();
	    return false;
	}
	if(user_id.value.length == 0){
		alert('IDは必須項目です。入力を確認してください。');
		user_id.focus();
		user_id.select();
	    return false;
	}
	if(user_pw.value.length == 0){
		alert('パスワードは必須項目です。入力を確認してください。');
		user_pw.focus();
		user_pw.select();
	    return false;
	}
	if(user_pw2.value.length == 0){
		alert('パスワード(確認用)は必須項目です。入力を確認してください。');
		user_pw2.focus();
		user_pw2.select();
	    return false;
	}
	if(user_company.value.length == 0){
		alert('会社名は必須項目です。入力を確認してください。');
		user_company.focus();
		user_company.select();
	    return false;
	}
	if(mail_addr.value.length == 0){
		alert('メールは必須項目です。入力を確認してください。');
		mail_addr.focus();
		mail_addr.select();
	    return false;
	}
	return true;
}


//UserInfo.jsp チェック用
function check_info() {
	var user_pw = document.getElementById("user_pw");
	var user_company = document.getElementById("user_company");
	var mail_addr = document.getElementById("mail_addr");

	if(8 > user_pw.value.length || user_pw.value.length > 14){
		alert('パスワードを正しい桁数で再度入力してください。');
		user_pw.focus();
		user_pw.select();
	    return false;
	}
	if(user_pw.value.length == 0){
		alert('パスワードは必須項目です。入力を確認してください。');
		user_pw.focus();
		user_pw.select();
	    return false;
	}
	if(user_company.value.length == 0){
		alert('会社名は必須項目です。入力を確認してください。');
		user_company.focus();
		user_company.select();
	    return false;
	}
	if(mail_addr.value.length == 0){
		alert('メールは必須項目です。入力を確認してください。');
		mail_addr.focus();
		mail_addr.select();
	    return false;
	}
	alert("修正されました。");
	return true;
}


//UserSearch.jsp 検索語リセット
function reset() {
	var searchText = document.getElementById("searchText");

	searchText.value = "";
	return true;
}

