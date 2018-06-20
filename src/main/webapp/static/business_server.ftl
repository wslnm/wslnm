<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>业务账号对应服务器信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
</head>
<body>
<div>&nbsp;</div>
<div>&nbsp;</div>
<div align="center" style="font-size: 34px">业务账号对应服务器信息</div>
<div>&nbsp;</div>
<div>&nbsp;</div>
<table class="layui-hide" id="test"></table>
<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>
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
                {field:'businessAccount', width:218, title: '业务账号', sort: true}
                ,{field:'serverInfo', width:218, title: '服务器信息'}
                ,{field:'loginTime', width:218, title: '登入时间', sort: true}
                ,{field:'exitTime', width:218, title: '登出时间'}
                ,{field:'time', title: '时长(单位:秒)', width:218}
                ,{field:'cost', width:218, title: '费用'}
                ,{field:'taocan', width:218, title: '资费套餐'}
            ]]
            ,data:[{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            },{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            },{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            },{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            },{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            },{
                "businessAccount":"yuki",
                "serverInfo":"123.213.213.21",
                "loginTime":"1993-09-09",
                "exitTime":"2009-09-09",
                "time":"80000",
                "cost":"500",
                "taocan":"180一月"
            }
               ]
            ,page: true
        });
    });
</script>

</body>
</html>