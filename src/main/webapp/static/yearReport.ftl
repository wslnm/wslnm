<!DOCTYPE html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<title>电信管理系统</title>
	<meta name="renderer" content="webkit">
 	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" type="text/css" href="/project/static/css/htmleaf-demo.css">
	<link rel="stylesheet" type="text/css" href="/project/static/css/nav.css">
	<link rel="stylesheet" type="text/css" href="/project/static/fonts/iconfont.css">
	<link rel="stylesheet" href="/project/static/layui/css/layui.css"  media="all">

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
			<h1>账单报表信息</h1>
			<div class="htmleaf-links"></div>
		</header>
		<br/><br/>
		<div class="layui-btn-group demoTable" style="margin-left: 240px;">
			<button id="btnBill" class="layui-btn" data-type="getCheckData">查询年度账单报表</button>
			<button id="btnBusiness" class="layui-btn" data-type="getCheckLength">查询具体业务报表</button>
		</div>
		
		<div class="" style="width:auto;height:640px;margin-left: 220px;">
			
			<table class="layui-table" id="LAY_table_user" lay-filter="user"></table>
				
		</div>
	</div>
	<script src="/project/static/layui/layui.js" charset="utf-8"></script>
	<script>
		layui.use('table', function(){
			var table = layui.table;
			
			//方法级渲染
			var table1=table.render({
				elem: '#LAY_table_user'
				,id:  "table1"
				,url: '/project/server/table'
				,cols: [[
					 {type:'checkbox', fixed: 'left'}
				 	,{field:'userName', width:250, title: '真实姓名', sort: true}
					,{field:'userAcc', width:250, title: '账务账号'}
					,{field:'userIdcard', width:250, title: '身份证', sort: true}
					,{field:'userGender', width:220, title: '性别'}
					,{field:'userTel', title: '联系电话', width: 250},
				]]
				,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
    		  layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
    		  //,curr: 1 
     		 ,groups: 1 
    		 ,first: false 
     		 ,last: false
      			 }
				,height: 355
			});
			
			
		    table.on('checkbox(user)', function(obj){
  				  console.log(obj)
  				});
  				
		    var $ = layui.$, active = {
   				  
   			   getCheckData: function(){ //获取选中数据
    			  var checkStatus = table.checkStatus('table1')
    		  	 ,data = checkStatus.data;
    		  	 window.location.href="/project/server/yearPie?acc="+data[0].userAcc+""
   			 			 }
   			 			 
   			  ,getCheckLength: function(){ //获取选中
     			  var checkStatus = table.checkStatus('table1')
    		     ,data = checkStatus.data;
     			  window.location.href="/project/server/yearCategory?acc="+data[0].userAcc+""
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