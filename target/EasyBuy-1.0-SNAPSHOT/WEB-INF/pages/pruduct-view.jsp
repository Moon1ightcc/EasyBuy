<%--
  Created by IntelliJ IDEA.
  User: IKURA
  Date: 2022/6/10
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>易买网 - 首页</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="scripts/function.js"></script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="images/logo.gif" /></div>
    <div class="help"><a href="#" class="shopping">购物车</a><a href="login.html">登录</a><a href="register.html">注册</a><a href="guestbook.html">留言</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li class="current"><a href="#">首页</a></li>
            <li><a href="#">图书</a></li>
            <li><a href="#">百货</a></li>
            <li><a href="#">品牌</a></li>
            <li><a href="#">促销</a></li>
        </ul>
    </div>
</div>
<div id="childNav">
    <div class="wrap">
        <ul class="clearfix">
            <li class="first"><a href="#">音乐</a></li>
            <li><a href="#">影视</a></li>
            <li><a href="#">少儿</a></li>
            <li><a href="#">动漫</a></li>
            <li><a href="#">小说</a></li>
            <li><a href="#">外语</a></li>
            <li><a href="#">数码相机</a></li>
            <li><a href="#">笔记本</a></li>
            <li><a href="#">羽绒服</a></li>
            <li><a href="#">秋冬靴</a></li>
            <li><a href="#">运动鞋</a></li>
            <li><a href="#">美容护肤</a></li>
            <li><a href="#">家纺用品</a></li>
            <li><a href="#">婴幼奶粉</a></li>
            <li><a href="#">饰品</a></li>
            <li class="last"><a href="#">Investor Relations</a></li>
        </ul>
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; <a href="product-list.html">图书音像</a> &gt; 图书
</div>
<div id="main" class="wrap">
    <div class="lefter">
        <div class="box">
            <h2>商品分类</h2>
            <dl>
                <dt>图书音像</dt>
                <dd><a href="product-list.html">图书</a></dd>
                <dd><a href="product-list.html">音乐</a></dd>
                <dt>百货</dt>
                <dd><a href="product-list.html">运动健康</a></dd>
                <dd><a href="product-list.html">服装</a></dd>
                <dd><a href="product-list.html">家居</a></dd>
                <dd><a href="product-list.html">美妆</a></dd>
                <dd><a href="product-list.html">母婴</a></dd>
                <dd><a href="product-list.html">食品</a></dd>
                <dd><a href="product-list.html">手机数码</a></dd>
                <dd><a href="product-list.html">家具首饰</a></dd>
                <dd><a href="product-list.html">手表饰品</a></dd>
                <dd><a href="product-list.html">鞋包</a></dd>
                <dd><a href="product-list.html">家电</a></dd>
                <dd><a href="product-list.html">电脑办公</a></dd>
                <dd><a href="product-list.html">玩具文具</a></dd>
                <dd><a href="product-list.html">汽车用品</a></dd>
            </dl>
        </div>
    </div>
    <div id="product" class="main">
        <h1>铁三角 Audio-Technica ATH-EQ300M-SV 银色 挂耳式耳机</h1>
        <div class="infos">
            <div class="thumb"><img src="images/product/0.jpg" /></div>
            <div class="buy">
                <p>商城价：<span class="price">￥99.00</span></p>
                <p>库　存：有货</p>
                <p>库　存：有货</p>
                <p>库　存：有货</p>
                <p>库　存：有货</p>
                <div class="button"><input type="button" name="button" value="" onclick="goBuy(1)" /><a href="#">放入购物车</a></div>
            </div>
            <div class="clear"></div>
        </div>
        <div class="introduce">
            <h2><strong>商品详情</strong></h2>
            <div class="text">
                sdf<br />
                sdf<br />
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2010  All Rights Reserved. 京ICP证1000001号
</div>
</body>
</html>
