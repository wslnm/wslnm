<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>电信管理系统</title>
	<link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
	<link rel="stylesheet" type="text/css" href="css/nav.css">
	<link rel="stylesheet" type="text/css" href="fonts/iconfont.css">
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">

</head>
<body>
	<div class="nav">
	        <div class="nav-top">
	            <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="images/mini.png" ></div>
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
	    </div>
	<div class="htmleaf-container">
		<header class="htmleaf-header">
			<h1>登录日志</h1>
			<div class="htmleaf-links"></div>
		</header>
		<div class="" style="width:auto;height:640px;margin-left: 220px;">
			<div>&nbsp;</div>
			<div class="demoTable">


				<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>


			</div>
		</div>
	</div>
	<script src="layui/layui.js" charset="utf-8"></script>
	<script>
		layui.use('table', function(){
			var table = layui.table;

			//方法级渲染
			table.render({
				elem: '#LAY_table_user'
//				,url: '/demo/table/user/'
				,cols: [[
				 	 {field:'adminName', width:260, title: '管理员名称', sort: true}
					,{field:'adminLevel', width:260, title: '管理员级别'}
					,{field:'useTime', width:260, title: '操作时间', sort: true}
					,{field:'ip', width:260, title: 'IP'}
					,{field:'operation', title: '操作', width: 260},

				]]
				,data:[{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				},{
					"adminName":"yuki",
					"adminLevel":"超级管理员",
					"useTime":"1999-09-09",
					"ip":"123.21.3.12.3",
					"operation":"登录"
				}
				]

				,id: 'testReload'
				,page: true
				,height: 315
			});

			var $ = layui.$, active = {
				reload: function(){
					var demoReload = $('#demoReload');

					//执行重载
					table.reload('testReload', {
						page: {
							curr: 1 //重新从第 1 页开始
						}
						,where: {
							key: {
								id: demoReload.val()
							}
						}
					});
				}
			};

			$('.demoTable .layui-btn').on('click', function(){
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});
		});
	</script>
	<script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
	<script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
	<script type="text/javascript" src="js/nav.js"></script>
</body>
</html>