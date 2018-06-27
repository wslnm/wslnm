<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>电信管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/htmleaf-demo.css">
    <link rel="stylesheet" type="text/css" href="css/nav.css">
    <link rel="stylesheet" type="text/css" href="fonts/iconfont.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/layui.js"></script>
	<script src="js/jQuery-2.2.2-min.js"></script>
	<style>
		#table{
			position:absolute;
			left:260px;
		}
	</style>
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

<div style="width: 1400px;height:120px;text-align: center" >
    <h1 style="margin-top: 80px;font-size: xx-large">资费管理系统</h1>
</div>

<div class="layui-btn-group">
    <button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>
    <button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>
    <button class="layui-btn layui-btn-sm"><i class="layui-icon"></i></button>
</div>
<div id="table">
    <table class="layui-table" id="LAY_table_account" lay-filter="accountuv" lay-data="{id: 'idTest'}"></table>
</div>
<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="up">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="on">开通</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="off">暂停</a>
</script>
</body>
	<script>
		layui.use(['laydate','form', 'table','element','laypage'],function(  ){

        		var laydate = layui.laydate;
           	 	var form = layui.form;
            	var table = layui.table;
    			var $ = layui.$;
            	var element = layui.element;

				
				//监听工具条
				table.on('tool(accountuv)', function(obj){
				var data = obj.data;
				if(obj.event === 'up'){
					window.location.href="/project/static/UpdateTariff.ftl?id="+data.id;
				}else if(obj.event === 'on'){
					window.location.href="/project/tariff/ooTariff?id="+data.id+"&status=1";
				}else if(obj.event === 'off'){
					window.location.href="/project/tariff/ooTariff?id="+data.id+"&status=0";
				}
  });
            	form.render();
           		 element.init();

        		var table = layui.table;
                        //执行渲染
                        table.render({
                         elem:'#LAY_table_account'
                         ,height: 332
                         ,cellMinWidth: 80
                         ,url: '/project/tariff/findAll' //数据接口
                         ,cols:  [[
                                {field: 'id', title: 'ID', width: 60}
                               ,{field: 'tariffName', title: '资费名称', width: 110}
                               ,{field: 'tariffType', title: '资费类型', width: 110}
                               ,{field: 'basicTime', title: '使用时长', width: 110}
                               ,{field: 'basicCost', title: '基本费用', width: 110}
                               ,{field: 'unitCost', title: '单位费用', width: 110}
                               ,{field: 'tariffDirections', title: '资费说明', width: 110}
                               ,{field: 'tariffStatus', title: '资费状态', width: 110}
							   ,{field: 'toolbar', toolbar: '#barDemo', width: 200}
                         ]]

                	,id:'accountlist'
                	,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
          				layout: ['limit', 'count', 'prev', 'page', 'next'] //自定义分页布局
         				 //,curr: 1 //设定初始在第 5 页
         				 ,groups: 1 //只显示 1 个连续页码
         			 	,first: '首页' //不显示首页
          				,last: '尾页 '//不显示尾页
          				,limit:5

        			}

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

    			 var active = {
        			reload: function(){
         			 var accountNumber = $('#accountNumber');
         			 var realName=$('#realName');
          					//执行重载
         				 table.reload('accountlist', {
           				 	page: {
              					curr: 1 //重新从第 1 页开始
           					}
            				,where: {
               				 	account: accountNumber.val()
               				 	,name:realName.val()

           				 	}
          				});
        			}
      			};

        		$('.layui-form-item .layui-btn').on('click', function(){
        			var type = $(this).data('type');
        			active[type] ? active[type].call(this) : '';
     			 });
				
        });
		
		
	</script>
</html>