<%--
  Created by IntelliJ IDEA.
  User: IKURA
  Date: 2022/6/14
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%-- 商品列表联合查询页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理 - 易买网</title>
    <link type="text/css" rel="stylesheet" href="/EasyBuy/css/style.css" />
    <script type="text/javascript" src="../scripts/function-manage.js"></script>
    <script src="../js/jquery-3.6.0.min.js"></script>

    <script>
        function confirmDelete(id) {
            if(window.confirm("确定要删除吗")){
                $.ajax({
                    url: "DeleteProduct.do?id="+id,
                    success: function(){
                        window.location.href = "productList.do"
                    }});
            }else{

            }
        }
    </script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="../images/logo.gif" /></div>
    <div class="help"><a href="../index.html">返回前台页面</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li><a href="index.html">首页</a></li>
            <li><a href="user.html">用户</a></li>
            <li class="current"><a href="product.html">商品</a></li>
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
                <dd><em><a href="showInputProduct.do">新增</a></em><a href="queryOrders.do">订单管理</a></dd>
                <dt>留言管理</dt>
                <dd><em><a href="">新增</a></em><a href="">留言管理</a></dd>
                <dt>新闻管理</dt>
                <dd><em><a href="news-add.html">新增</a></em><a href="news.html">新闻管理</a></dd>
            </dl>
        </div>
    </div>
    <div class="main">
        <h2>商品管理</h2>
        <div class="manage">
            <table class="list">
                <thead>
                <tr>
                    <th>商品图片</th>
                    <th>所属大分类</th>
                    <th>所属小分类</th>
                    <th>商品名称</th>
                    <th>销售价格</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pros}" var="pro">
                <tr>
                    <td class="first w4 c"><img style="width: 60px;height: 40px" src="${pro.picUrl}"></td>
                    <td class="w1 c">${pro.bigCatname}</td>
                    <td class="w1 c">${pro.smallCatname} </td>
                    <td class="w1 c">${pro.name} </td>
                    <td class="w1 c">${pro.salePrice} </td>
                    <td class="w1 c"><a href="showEditProduct.do?id=${pro.id}">修改</a>
                        <a id="delete"  onclick="confirmDelete(${pro.id})">删除</a></td>
                </tr>
                </tbody>
                </c:forEach>
            </table>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号
</div>
</body>
</html>

