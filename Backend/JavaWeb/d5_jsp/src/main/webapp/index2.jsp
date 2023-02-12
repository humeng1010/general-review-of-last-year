<%--
  Created by IntelliJ IDEA.
  User: humeng
  Date: 2023/2/12
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
   String name = "张四";
%>
<%--
<%.....%>：内容会直接放到_jspService()方法之中
--%>
<%
  out.println("你好");
  out.println(name);
%>
<%--<%=...%>：内容会放到out.print()之中，作为out.print()的参数--%>
<%="abc"%>
</body>
</html>
