<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>账单查询系统(月)</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="layui/css/layui.css?version=20180522"  media="all">
</head>
<body>
<div style="width: 1400px;height:120px;text-align: center" >
    <h1 style="margin-top: 80px;font-size: xx-large">账单查询系统(月)</h1>
</div>
<div style="padding: 5px; background: #eee;">
    <table style="width: 100%; height: 100%">
        <thead>
        <tr>
            <th>实验室名称</th>
            <th>月份</th>
            <th>当月总时长</th>
        </tr>
        </thead>
    </table>
</div>

<div style="width: 1400px;height:120px;text-align: center;position: absolute;left: 150px;top: 430px">
    <h3 style="margin-top: 50px;font-size: large">
        月份：
        <input type="text" placeholder="请输入" >
        <button class="layui-btn layui-btn-normal layui-btn-radius" style="width: 80px">搜索</button>
    </h3>
</div>

</body>
</html>