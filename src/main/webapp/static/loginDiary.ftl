<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>电信管理系统</title>
    <link rel="stylesheet" type="text/css" href="/project/static/css/htmleaf-demo.css">
    <link rel="stylesheet" type="text/css" href="/project/static/css/nav.css">
    <link rel="stylesheet" type="text/css" href="/project/static/fonts/iconfont.css">
    <link rel="stylesheet" href="/project/static/layui/css/layui.css" media="all">

</head>
<body>
<div class="nav">
    <div class="nav-top">
        <div id="mini" style="border-bottom:1px solid rgba(255,255,255,.1)"><img src="/project/static/images/mini.png"></div>
    </div>
    <ul>
        <li class="nav-item">
            <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>用户管理系统</span><i
                    class="my-icon nav-more"></i></a>
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
            <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>权限管理系统</span><i
                    class="my-icon nav-more"></i></a>
            <ul>
                <li><a href="javascript:;"><span>角色管理</span></a></li>
                <li><a href="javascript:;"><span>权限管理</span></a></li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>前台日志系统</span><i
                    class="my-icon nav-more"></i></a>
            <ul>
                <li><a href="/project/static/loginDiary.ftl"><span>登录服务日志</span></a></li>
                <li><a href="/project/static/operationDiary.ftl"><span>操作服务日志</span></a></li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="javascript:;"><i class="my-icon nav-icon icon_3"></i><span>报表查询系统</span></a>
        </li>
        <li class="nav-item">
            <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>前台用户系统</span><i
                    class="my-icon nav-more"></i></a>
            <ul>
                <li><a href="javascript:;"><span>用户自服务系统</span></a></li>
            </ul>
        </li>
        <li class="nav-item">
            <a href="javascript:;"><i class="my-icon nav-icon icon_1"></i><span>基础公共服务</span><i
                    class="my-icon nav-more"></i></a>
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
        <h1>登录服务日志</h1>

        <div class="htmleaf-links"></div>
    </header>
    <div class="demoTable" style="width:auto;height:640px;margin-left: 220px;">
        <div>&nbsp;</div>
        <form class="layui-form xbs" action="/project/loginlog/giveparams2Page">
            <div class="layui-form-pane" style="text-align: center;">
                <div class="layui-form-item" style="display: inline-block;">
                    <div class="layui-input-inline">
                        <input type="text" name="adminName" placeholder="管理员名称" autocomplete="off" class="layui-input"
                               width="60px" id="demoReload">
                    </div>
                    <label class="layui-form-label xbs768">日期范围</label>

                    <div class="layui-input-inline">
            			<input type="text" id="startTime" name="startTime" autocomplete="off" placeholder="请输入开始时间" class="layui-input" >
        			</div> 
        			<div class="layui-input-inline">
            			<input type="text" id="endTime" name="endTime" autocomplete="off" placeholder="请输入结束时间" class="layui-input" >
        			</div>

                    <div class="layui-input-inline" style="width:8px">
                        <button class="layui-btn" data-type="reload" lay-submit="" lay-filter="sreach"><i
                                class="layui-icon">&#xe615;</i>
                        </button>
                    </div>
                </div>
            </div>
        </form>


        <table class="layui-hide" id="LAY_login_log" lay-filter="loginlog"></table>
    </div>
</div>
</div>
<script src="/project/static/layui/layui.js" charset="utf-8"></script>
<script src="/project/static/js/jquery-1.11.0.min.js" type="text/javascript"></script>
//
<script>window.jQuery || document.write('<script src="/project/static/js/jquery-1.11.0.min.js"><\/script>')</script>
<script type="text/javascript" src="/project/static/js/nav.js"></script>
<script>

    layui.use('table', function () {
        var table = layui.table;

        //方法级渲染
        table.render({
            elem: '#LAY_login_log'
            ,id:'testReload'
            , url: '/project/loginlog/getLoginLogPager'
            , cols: [[
                {field: 'adminName', align: 'center', width: 230, title: '管理员名称', sort: true}
                , {field: 'roleName', align: 'center', width: 230, title: '管理员级别'}
                , {
                    field: 'operationDate',
                    align: 'center',
                    width: 230,
                    title: '操作时间',
                    sort: true,
                    templet: '<div>{{ Format(d.operationDate,"yyyy-MM-dd h:m:s.S")}}</div>'
                }
                , {field: 'ip', align: 'center', width: 230, title: 'IP'}
                , {field: 'operation', align: 'center', title: '操作', width: 210},

            ]]
            , page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
                layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
                //,curr: 1
            }
            , groups: 1
            , first: false
            , last: false
            //回调函数
            , done: function (res, page, count) {

                //分类显示中文名称
                $("[data-field='roleName']").children().each(function () {
                    if ($(this).text() == '0') {
                        $(this).text("超级管理员")
                    } else if ($(this).text() == '1') {
                        $(this).text("普通管理员")
                    } else if ($(this).text() == '2') {
                        $(this).text("用户")
                    }
                })
                //分类显示中文名称(操作)
                $("[data-field='operation']").children().each(function () {
                    if ($(this).text() == '0') {
                        $(this).text("登录")
                    } else if ($(this).text() == '1') {
                        $(this).text("退出")
                    }
                })
                //绑定click点击事件
                $('.demoTable .layui-btn').on('click', function () {
                    var type = $(this).data('type');
                    active[type] ? active[type].call(this) : '';
                });
            }
        })
		//点击事件
        var $ = layui.$, active = {
            reload: function () {
                var demoReload = $('#demoReload');

                table.reload('testReload', {
                    where: {
                        adminName: demoReload.val()
                    }
                });
            }
        };
    });

    // 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
    // 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
    // 例子：
    //Format("2016-10-04 8:9:4.423","yyyy-MM-dd hh:mm:ss.S") ==> 2016-10-04 08:09:04.423
    // Format("1507353913000","yyyy-M-d h:m:s.S")      ==> 2017-10-7 13:25:13.0
    function Format(datetime, fmt) {
        if (parseInt(datetime) == datetime) {
            if (datetime.length == 10) {
                datetime = parseInt(datetime) * 1000;
            } else if (datetime.length == 13) {
                datetime = parseInt(datetime);
            }
        }
        datetime = new Date(datetime);
        var o = {
            "M+": datetime.getMonth() + 1,                 //月份
            "d+": datetime.getDate(),                    //日
            "h+": datetime.getHours(),                   //小时
            "m+": datetime.getMinutes(),                 //分
            "s+": datetime.getSeconds(),                 //秒
            "q+": Math.floor((datetime.getMonth() + 3) / 3), //季度
            "S": datetime.getMilliseconds()             //毫秒
        };
        if (/(y+)/.test(fmt))
            fmt = fmt.replace(RegExp.$1, (datetime.getFullYear() + "").substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    }
    //console.log(Format("1507353913000","yyyy-M-d h:m:s.S"));

</script>

//锁定开始时间和结束时间的可选范围
<script>
    layui.use('laydate', function(){
        var laydate = layui.laydate;
        var endDate= laydate.render({
            elem: '#endTime',//选择器结束时间
            type: 'datetime',
            min:"1970-1-1",//设置min默认最小值
            done: function(value,date){
                startDate.config.max={
                    year:date.year,
                    month:date.month-1,//关键
                    date: date.date,
                    hours: 0,
                    minutes: 0,
                    seconds : 0
                }
            }
        });
        //日期范围
        var startDate=laydate.render({
            elem: '#startTime',
            type: 'datetime',
            max:"2099-12-31",//设置一个默认最大值
            done: function(value, date){
                endDate.config.min ={
                    year:date.year,
                    month:date.month-1, //关键
                    date: date.date,
                    hours: 0,
                    minutes: 0,
                    seconds : 0
                };
            }
        });
    });
</script>

</body>
</html>