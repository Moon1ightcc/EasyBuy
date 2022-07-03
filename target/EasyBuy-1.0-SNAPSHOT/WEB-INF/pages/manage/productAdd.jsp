<%--
  Created by IntelliJ IDEA.
  User: IKURA
  Date: 2022/6/19
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>后台管理 - 易买网</title>
    <link type="text/css" rel="stylesheet" href="/EasyBuy/css/style.css" />
    <script type="text/javascript" src="../scripts/function-manage.js"></script>
    <script src="../js/jquery-3.6.0.min.js"></script>
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
                <dd><a href="order.html">订单管理</a></dd>
                <dt>留言管理</dt>
                <dd><a href="guestbook.html">留言管理</a></dd>
                <dt>新闻管理</dt>
                <dd><em><a href="news-add.html">新增</a></em><a href="news.html">新闻管理</a></dd>
            </dl>
        </div>
    </div>
    <div class="main">
        <h2>添加商品</h2>
        <div class="manage">
            <form action="AddProduct.do" method="post" enctype="multipart/form-data">
                <table class="form">
                    <tr>
                        <td class="field">商品名称：</td>
                        <td><input type="text" class="text" name="name"/></td>
                    </tr>
                    <tr>
                        <td class="field">商品说明:</td>
                        <td><input type="text" class="text" name="description" ></td>
                    </tr>
                    <tr>
                        <td class="field" >所属大分类：</td>
                        <td>
                            <select name="parentId" id="bigCat">
                                <option value="">请选择</option>
                                <c:forEach items="${bigs}" var="big">
                                    <option value="${big.id}">${big.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="field">所属小分类：</td>
                        <td>
							<span id="smallsp">
									<option value="-1">请选择</option>
                                </select>
							</span>
                        </td>
                    </tr>
                    <tr>
                    <tr>
                        <td class="field">商品图片：</td>
                        <td><input type="file" class="text" name="tupian" /></td>
                    </tr>
                    <tr>
                        <td class="field">商品价格：</td>
                        <td><input type="text" class="text" name="salePrice"  /> 元</td>
                    </tr>
                    <tr>
                        <td class="field">成本价格：</td>
                        <td><input type="text" class="text" name="costPrice"  /> 元</td>
                    </tr>
                    <tr>
                        <td class="field">上架时间：</td>
                        <td><input type="date" class="text" name="createTime" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label class="ui-blue"><input type="submit" name="submit" value="添加" /></label></td>
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
<script>
    $(function () {
        $("#bigCat").change(function () {
            let bid = $("#bigCat").val();
            $.get("getSmalls.do","bigId="+bid,function (rs) {
                $("#smallsp").html(rs);
            })
        })
    })
</script>