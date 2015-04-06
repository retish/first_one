<%@ page import="java.util.Date" %>
<%@ page import="edu.cheezelovers.firstweb.servlet.ProductInfo" %>
<%@ page import="edu.cheezelovers.firstweb.servlet.DataHolder" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
  Created by IntelliJ IDEA.
  User: kristina
  Date: 2/10/15
  Time: 1:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<table style="border: 1px solid #6495ed">
    <tbody>
    <tr>
        <td>Первый</td>
        <td>Второй</td>
    </tr>
    <tr>
        <td>Третий</td>
        <td>Четвертый</td>
    </tr>
    <tr>
        <td>Пятый</td>
        <td>Шестой</td>
    </tr>
    </tbody>
    <ul>
    <%
        ProductInfo[] productInfos = DataHolder.getProductInfo();
        request.setAttribute("productInfo", productInfos);
        for (ProductInfo info : productInfos) {
    %>
        <li>
            <%=info.product%> - <%=info.price%>
        </li>

    <%

        }

    %>
    </ul>

</table>
<% System.out.println("это сервлетушка"); %>
<ul>
    <c:forEach items = "${productInfo}" var="info">
        <li>
            ${info.product} - ${info.price}
        </li>
    </c:forEach>
</ul>

<p style="color: red">текущее время: <%= new Date().toString()%></p>
</body>
</html>