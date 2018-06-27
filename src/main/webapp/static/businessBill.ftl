<!DOCTYPE html>
<html> 
<head lang="en">
    <meta charset="UTF-8">
    <title>业务账单费用明细信息</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery-1.11.0.min.js" type="text/javascript"></script>
    <script>window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')</script>
    <script type="text/javascript" src="js/nav.js"></script>
</head>
<body>
<div>&nbsp;</div>
<div>&nbsp;</div>
<div align="center" style="font-size: 34px">业务账单费用明细信息</div>
<div>&nbsp;</div>
<div>&nbsp;</div>
<table class="layui-hide" id="LAY_table_user" lay-filter="user"></table>
<div>&nbsp;</div><div>&nbsp;</div><div>&nbsp;</div>
<div align="center"><button class="layui-btn-normal" style="padding: 7px 20px">返回</button></div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="look">查看</a>
</script>
<script src="layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('table', function(){
        var laydate = layui.laydate;
        var form = layui.form;
        var table = layui.table;
        var $ = layui.$;
        var element = layui.element;

        var thisURL = document.URL;
        var  getval =thisURL.split('?')[1];
        var showval= getval.split("=")[1];

        //监听工具条
        table.on('tool(user)', function(obj){
            var data = obj.data;
            if(obj.event === 'look'){
                //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            }
        });

        table.render({
            elem: '#LAY_table_user'
           ,url:'/project/busbill/findAll?useracc='+showval
            ,cols: [[
                {field:'businessBillOsAcc', width:240, title: '业务账号', sort: true}
                ,{field:'businessBillServer', width:240, title: '服务器信息', sort: true}
                ,{field:'businessBillDuration', width:240, title: '时长'}
                ,{field:'businessBillCost', title: '费用', width: 240}
                ,{field:'businessBillTariffPackage', width:240, title: '资费套餐'}
                ,{field: 'toolbar', toolbar: '#barDemo', width: 150}
            ]]

            ,id: 'testReload'
            ,page: true
            ,height: 315
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
    });
</script>

</body>
</html>