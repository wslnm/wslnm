<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
		<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>电信管理系统</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script> -->
	<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
	<link href="/project/static/css/style.css" rel='stylesheet' type='text/css' />
	
	<!-- <link href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
	<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'> -->
	
<!-- 	<script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script> -->
	<link rel="stylesheet" type="text/css" href="/project/static/css/htmleaf-demo.css">
	<link rel="stylesheet" type="text/css" href="/project/static/css/nav.css">
	<link rel="stylesheet" type="text/css" href="/project/static/fonts/iconfont.css">

	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="/project/static/layui/css/layui.css"  media="all">

<style >
	.xg{
		background-color: #74777b;
		color:pink;
	}
	.layui-field-box{
		color: pink;
		
	}

</style>

</head>


<body>
<div class="nav">
	<div class="nav-top">
		<div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="/project/static/images/mini.png" ></div>
	</div>
	<ul>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>用户管理系统</span><i class="my-icon nav-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>账务管理系统</span></a></li>
				<li><a href="javascript:;"><span>业务管理系统</span></a></li>
			</ul>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_2"></i><span>管理员管理系统</span></a>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>资费管理系统</span></a>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>账单查询系统</span></a>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>账务查询系统</span></a>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>权限管理系统</span><i class="my-icon nav-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>角色管理</span></a></li>
				<li><a href="javascript:;"><span>权限管理</span></a></li>
			</ul>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>前台日志系统</span><i class="my-icon nav-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>登录服务日志</span></a></li>
				<li><a href="javascript:;"><span>操作服务日志</span></a></li>
			</ul>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>报表查询系统</span></a>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>前台用户系统</span><i class="my-icon nav-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>用户自服务系统</span></a></li>
			</ul>
		</li>
		<li class="nav-item">
			<a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>基础公共服务</span><i class="my-icon nav-more"></i></a>
			<ul>
				<li><a href="javascript:;"><span>登录服务</span></a></li>
				<li><a href="javascript:;"><span>个人信息</span></a></li>
				<li><a href="javascript:;"><span>修改密码</span></a></li>
				<li><a href="javascript:;"><span>修改系统</span></a></li>
			</ul>
		</li>
	</ul>
</div >
<div class="htmleaf-container" >

	<div class="related" style="float: right ;width: 1300px ; height: 700px ;background-color: #74777b  ">
		<div style="width: 800px;height: 600px;position: relative;left: 20%">
			<h1>管理员个人信息</h1>
			
			<form action="/project/adminmag/update">
			
			<input type="hidden" name="id" id="id" value="${admin.id}">
			
			<fieldset class="layui-elem-field" >
				<legend>真实姓名</legend>
				<div class="layui-field-box">
					${admin.adminName}
				</div>
			</fieldset>
			<fieldset class="layui-elem-field" >
				<legend>账务账号</legend>
				<div class="layui-field-box">
					${admin.adminAcc}
				</div>
			</fieldset>
			<fieldset class="layui-elem-field" >
				<legend>联系方式(可修改)</legend>
				<div class="layui-field-box">
					<input class="xg" value="${admin.adminTel}" name="adminTel">
				</div>
		</fieldset>
			<fieldset class="layui-elem-field" 	>
				<legend>邮箱</legend>
				<div class="layui-field-box">
					${admin.adminEmail}
				</div>
			</fieldset>
			
			<!-- 密码框 -->
				<fieldset class="layui-elem-field" 	>
				<legend>修改密码</legend>
				<div class="layui-field-box">
				<input type="password" value="	${admin.adminPwd}" name="adminPwd">
				</div>
			</fieldset>
			
			<fieldset class="layui-elem-field" 	>
				<legend>权限</legend>
				<div class="layui-field-box">
					超级管理员
				</div>
			</fieldset>
			<input style="width: 300px" type="submit" id="update" value="确认修改">
		</form>
		</div>
	</div>
			<button style="width: 300px;margin-left: 710px" class="layui-btn layui-btn-normal layui-btn-radius" style="width: 300px" onclick="window.location.href='/project/static/LoginAdmin.ftl'">返回</button>

</div>

<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
<script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
<script type="text/javascript" src="js/nav.js"></script>
</body>
</html>