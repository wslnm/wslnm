<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>电信管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>
<body>
<div>&nbsp;</div>
<div>&nbsp;</div>
<div align="center" style="font-size: 34px">账务查询系统(日)</div>
<div>&nbsp;</div>
<div>&nbsp;</div>
<table class="layui-hide" id="test"></table>
<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>

<div align="center"><span style="font-size: 24px">日期：</span><input type="text" placeholder="请输入日期(1-31)，如12"style="padding: 7px 15px" >
    &nbsp;
    <button class="layui-btn layui-btn-normal">搜索</button>
</div>
<div>&nbsp;</div><div>&nbsp;</div>
<div align="center"><button class="layui-btn-normal" style="padding: 7px 20px">返回</button></div>

<script src="layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var table = layui.table;

        table.render({
            elem: '#test'
//            ,url:'/demo/table/user/'
            ,cols: [[
                {field:'serverInfo', width:520, title: '实验室名称'}
                ,{field:'day', width:510, title: '日期', sort: true}
                ,{field:'totalTimeDay', width:500, title: '当天总时长', sort: true}
            ]]
            ,data:[{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            },{
                "serverInfo":"123",
                "day":"12",
                "totalTimeDay":"8000"
            }
               ]
            ,page: true
        });
    });
</script>

</body>
</html>