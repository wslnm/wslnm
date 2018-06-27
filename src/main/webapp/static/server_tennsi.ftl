<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>电信管理系统</title>
    <link rel="stylesheet" type="text/css" href="/project/static/css/htmleaf-demo.css">
    <link rel="stylesheet" type="text/css" href="/project/static/css/nav.css">
    <link rel="stylesheet" type="text/css" href="/project/static/fonts/iconfont.css">
    <link rel="stylesheet" href="/project/static/layui/css/layui.css"  media="all">
    <script type="text/javascript"
	src="/project/static/js/jQuery-2.2.2-min.js"></script>


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
</div>

<div style="width: 1400px;height:120px;text-align: center" >
<h1 style="margin-top: 80px;font-size: xx-large;color: black">账单查询系统(年)</h1>
</div>
<form action="/project/serverMonth/check">
<div style="width: 1400px;height:120px;text-align: center">
    <h3 style="font-size: large;color: black">
        账务账号：
        <input type="text" id="acc" name="acc" placeholder="请输入" >
    </h3>
</div>
<div style="width: 1400px;height:120px;text-align: center">
    <button  type="submit" class="layui-btn layui-btn-normal layui-btn-radius" id="btnMonth" style="width: 200px">以月为单位查询</button>
</div>
</form>

<form action="../serverYear/check">
    <div style="width: 1400px;height:120px;text-align: center">
        <h3 style="font-size: large;color: black">
            账务账号：
            <input type="text" id="userAcc" name="acc" placeholder="请输入" >
        </h3>
    </div>

    <div style="width: 1400px;height:120px;text-align: center">
        <button  type="submit" class="layui-btn layui-btn-normal layui-btn-radius" id="btnYear" style="width: 200px">以年为单位查询</button>
    </div>
</form>

</body>
<script>
</script>
</html>