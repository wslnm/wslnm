<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>	
<head>
<title>�û���¼ҳ��</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script> -->
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="css/style.css" rel='stylesheet' type='text/css' />

<script type="text/javascript"
	src="../static/js/jQuery-2.2.2-min.js?version=20180522" charset="utf-8"></script>
</head>
<body>
<style>
	.div-left{width:70px;height:20px;float:left;margin-left: 25px}
</style>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
	
	//获取用户输入数据
	$('#login').click(function(){
		var url = "/project/user/"+$('#acc').val()+"/"+$('#pwd').val();
		console.log(url)
		$.ajax({
			type:"GET",
			url:url,
			data:
			success:function(messagerBean){
				console.log(messagerBean);
				//如果账号密码匹配，跳转到个人信息。否则失败
				if(messagerBean.status){
					location.href ="userInfo.ftl";
				}else {
					alert("Login Failed")
				}
			}
		})
	})
});

</script>
 <!--SIGN UP-->
 <h1>Login User</h1>
<div class="login-form">
	<div class="close"> </div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
			<div class="clear"> </div>
	<div class="avtar">
		<img src="images/avtar.png" />
	</div>
			<form>
			<!-- 账号密码输入框 -->
					<input type="text" id="acc" class="text" value="Please enter your account number" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Please enter your account number';}" >
						<div class="">
					<input type="password" id="pwd" value=" " onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
							<br/>
			
							<br/>
							<span>zhengze</span>
							<br/>
							<!-- 切换管理员/用户 -->
							<a href="LoginUser.ftl" style="font-size: 15px ; color: #74777b">User</a>/<a href="LoginAdmin.ftl" style="font-size: 15px ; color: #74777b">Admin</a>
						</div>
			</form>
			
			<!-- 登录按钮 -->
	<div class="signin">
		<input type="button" id="login" value="Login" >
	</div>
</div>
 <div class="copy-rights">
					<p>Copyright &copy; 2018.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="ģ��֮��">����ϵͳ</a> - Collect from <a href="http://www.cssmoban.com/" title="��ҳģ��" target="_blank"></a></p>
			</div>

</body>
</html>