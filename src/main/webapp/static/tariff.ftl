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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<button class="layui-btn layui-btn-normal layui-btn-radius" style="height: 35px">开通资费</button>
<button class="layui-btn layui-btn-warm layui-btn-radius" style="height: 35px">暂停资费</button>

<div style="padding: 5px; background: #eee;">
    <table style="width: 100%; height: 100%">
        <thead>
        <tr>
            <th>资费名称</th>
            <th>资费类型</th>
            <th>基本时长</th>
            <th>基本费用</th>
            <th>单位费用</th>
            <th>资费说明</th>
            <th>资费状态</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>