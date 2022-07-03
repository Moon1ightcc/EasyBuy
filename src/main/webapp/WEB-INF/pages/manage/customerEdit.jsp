<%--
  Created by IntelliJ IDEA.
  User: IKURA
  Date: 2022/6/22
  Time: 12:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理 - 易买网</title>
    <link type="text/css" rel="stylesheet" href="../css/style.css" />
    <script type="text/javascript" src="../scripts/function-manage.js"></script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="../images/logo.gif" /></div>
    <div class="help"><a href="../index.html">返回前台页面</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li><a href="index.html">首页</a></li>
            <li class="current"><a href="user.html">用户</a></li>
            <li><a href="product.html">商品</a></li>
            <li><a href="order.html">订单</a></li>
            <li><a href="guestbook.html">留言</a></li>
            <li><a href="news.html">新闻</a></li>
        </ul>
    </div>
</div>
<div id="childNav">
    <div class="welcome wrap">
        管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
    <div id="menu-mng" class="lefter">
        <div class="box">
            <dl>
                <dt>用户管理</dt>
                <dd><em><a href="showInputCustomer.do">新增</a></em><a href="customerList.do">用户管理</a></dd>
                <dt>商品信息</dt>
                <dd><em><a href="showInputSmallCate.do">新增</a></em><a href="smallCateList.do">分类管理</a></dd>
                <dd><em><a href="showInputProduct.do">新增</a></em><a href="productList.do">商品管理</a></dd>
                <dt>订单管理</dt>
                <dd><a href="order.html">订单管理</a></dd>
                <dt>留言管理</dt>
                <dd><a href="guestbook.html">留言管理</a></dd>
                <dt>新闻管理</dt>
                <dd><em><a href="news-add.html">新增</a></em><a href="news.html">新闻管理</a></dd>
            </dl>
        </div>
    </div>
    <div class="main">
        <h2>修改用户</h2>
        <div class="manage">
            <form action="EditCustomer.do" method="post" enctype="multipart/form-data">
                <input type="hidden" name="id" value="${custe.id}">
                <table class="form">
                    <tr>
                        <td class="field">用户名：</td>
                        <td><input type="text" class="text" name="userName" value="${custe.userName}" /></td>
                    </tr>
                    <tr>
                        <td class="field">姓名：</td>
                        <td><input type="text" class="text" name="name" value="${custe.name}" /></td>
                    </tr>
                    <tr>
                        <td class="field">密码：</td>
                        <td><input type="text" class="text" name="password" value="${custe.password}" /></td>
                    </tr>
                    <tr>
                        <td class="field">性别：</td>
                        <td><input type="text" class="text" name="sex" value="${custe.sex}" /></td>
                    </tr>
                    <tr>
                        <td class="field">出生日期：</td>
                        <td><input type="date" class="text" name="birthday" value="${custe.birthday}"/></td>
                    </tr>
                    <tr>
                        <td class="field">手机号码：</td>
                        <td><input type="text" class="text" name="phoneNumber" value="${custe.phoneNumber}" /></td>
                    </tr>
                    <tr>
                        <td class="field">送货地址：</td>
                        <td><input type="text" class="text" name="address" value="${custe.address}" /></td>
                    </tr>
                    <tr>
                        <td class="field">头像:<img style="width: 60px;height: 40px" src="${custe.picture}"></td>
                        <td><input type="file" class="text" name="tupian" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="更新" /></label></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号
</div>
</body>
</html>