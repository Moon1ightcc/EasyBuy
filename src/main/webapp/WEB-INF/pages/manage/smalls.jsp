<%--
  Created by IntelliJ IDEA.
  User: IKURA
  Date: 2022/6/13
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<select  name="cateId" >
    <option value="-1">请选择</option>
    <c:forEach items="${smalls}" var="sm">
        <option value="${sm.id}">${sm.name}</option>
    </c:forEach>
</select>
