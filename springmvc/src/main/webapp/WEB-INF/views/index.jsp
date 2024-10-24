<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome to the Home Page!</h1>
    <h1>Called by Home controller</h1>
    <h1>URL: /home</h1>
    <!--
    <%
        String name = (String) request.getAttribute("name");
        ArrayList<String> peopleName = (ArrayList<String>)request.getAttribute("names");
    %>
    <h1>Name is <%= name %></h1>

    <%
        for(String pName: peopleName) {
    %>
    <h1> <%=pName %></h1>
    <%
        }
    %>
-->
<!--        Using JSP we can directly call the key-->
    <h1>${name}</h1>
    <h1>${names}</h1>

<!--    FOr Collections-->
<!--    <c:forEach var="item" items="${marks}">-->
<!--        <h1>${item}</h1>-->
<!--    </c:forEach>-->
</body>
</html>
