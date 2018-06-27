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
			<h1>账务账单查询系统</h1>
			<div class="htmleaf-links"></div>
		</header>
		<div class="" style="width:auto;height:640px;margin-left: 220px;">
			<div>&nbsp;</div>
			<div class="demoTable">
				<span style="color: black">身份证：</span><div class="layui-inline"><input class="layui-input" name="id" id="peopleInfo" autocomplete="off"></div>&nbsp;&nbsp;
				<span style="color: black">账务账号：</span><div class="layui-inline"><input class="layui-input" name="id" id="account" autocomplete="off"></div>&nbsp;&nbsp;
				<span style="color: black">用户姓名：</span><div class="layui-inline"><input class="layui-input" name="id" id="userName" autocomplete="off"></div>&nbsp;&nbsp;
				<span style="color: black">日期：</span><div class="layui-inline"><input class="layui-input" name="id" id="date1" autocomplete="off"></div>
				<button class="layui-btn" data-type="reload">搜索</button>

				<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>
				<br/><br/>
			</div>
		</div>
	</div>
    <script type="text/html" id="barDemo">
        <a class="layui-btn layui-btn-xs" lay-event="look">查看</a>
        <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="pay">支付</a>
    </script>
	<script src="layui/layui.js" charset="utf-8"></script>
	<script>
		layui.use('table', function(){
            var laydate = layui.laydate;
            var form = layui.form;
            var table = layui.table;
            var $ = layui.$;
            var element = layui.element;

            //监听工具条
            table.on('tool(user)', function(obj){
                var data = obj.data;
                if(obj.event === 'look'){
                    window.location.href="/project/static/businessBill.ftl?useracc="+data.userAcc;
                }else if(obj.event === 'pay'){
                    window.location.href="/project/accbill/payacc?useracc="+data.userAcc;
                }
            });

			//方法级渲染
			table.render({
				elem: '#LAY_table_user'
                ,url: '/project/accbill/findAll'
				,cols: [[
					{checkbox: true, fixed: true}
					,{field:'userIdcard', title: '身份信息', width:140}
					,{field:'userAcc', title: '账务账号', width:140}
					,{field:'accountingBillCost', title: '费用', width:140, sort: true}
					,{field:'accountingBillMonth', title: '月份', width:140,sort:true}
					,{field:'accountingBillCostPayMethod', title: '支付方式',width:140}
					,{field:'accountingBillPayStatus', title: '支付状态', sort: true, width:140}
                    ,{field: 'toolbar', toolbar: '#barDemo', width: 200}
				]]

				,id: 'testReload'
				,page: true
				,height: 315
                //回调函数
                ,done: function(res, curr, count){
                    //如果是异步请求数据方式，res即为你接口返回的信息。
                    //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
                    console.log(res);

                    //得到当前页码
                    console.log(curr);

                    //得到数据总量
                    console.log(count);
                    $("#account_notice").html("数据总数："+count);

                    //分类显示中文名称
                    $("[data-field='state']").children().each(function(){
                        if($(this).text()=='0'){
                            $(this).text("已开通")
                        }else if($(this).text()=='1'){
                            $(this).text("已暂停")
                        }

                    })
                }
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