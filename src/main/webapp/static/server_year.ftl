<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>电信管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/project/static/layui/css/layui.css"  media="all">
</head>
<body>
<div>&nbsp;</div>
<div>&nbsp;</div>
<div align="center" style="font-size: 34px">账务查询系统(年)</div>
<div>&nbsp;</div>
<div>&nbsp;</div>

<table class="layui-hide" id="test" lay-filter="demoEvent"></table>

<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>


<form action="/project/serverYear/btnCheck">
<div align="center"><span style="font-size: 24px">年份：</span><input type="text" name="year" id="year"  placeholder="请输入年份，如2012"style="padding: 7px 15px" >
    &nbsp;<input type="hidden" name="acc" id="acc" value="${acc}">
    <button class="layui-btn layui-btn-normal" id="btnCheck">搜索</button>
</div>
</form>
<div>&nbsp;</div>
<div align="center"><button  class="layui-btn-normal" style="padding: 7px 20px">返回</button></div>

<script type="text/javascript" src="/project/static/js/jquery-1.11.0.min.js"></script>
<script src="/project/static/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>

    layui.use('table', function(){
        var table = layui.table;
		
        table.render({
            elem: '#test'
            ,url:'/project/serverYear/table?acc=${acc}&year=${year}'
            ,cols: [[
                {field:'name', width:500, title: '实验室名称'}
                ,{field:'year', width:500, title: '年份',event: 'getYear',  style:'cursor: pointer;',sort: true}
                ,{field:'totalTime', width:500, title: '当年总时长', sort: true}
            ]]
            ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
    		  layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
      //,curr: 1 //设定初始在第 5 页
      ,groups: 1 //只显示 1 个连续页码
      ,first: false //不显示首页
      ,last: false //不显示尾页
      
    }
        }); 
        
     table.on('tool(demoEvent)', function(object){
    
     var data = object.data;
     var y=data.year;
    if(object.event === 'getYear'){
     
      console.log(data.year);
       window.location.href="/project/serverYear/jump?year="+y+"&acc=${acc}";
    }
    
  }); 
    });
 
</script>

</body>
</html>