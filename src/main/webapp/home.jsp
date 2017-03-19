<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="pageTitle" value="Java education"/>

<%@ page import="qq.yopta.education.task1.constants.ModelConst" %>

<html>
    <head>
        <title>${pageTitle}</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>

    <body>
        <div class="container" style="max-width:600px; width:80%;">
            <form:form method = "POST" modelAttribute="${ModelConst.USER}">
                <form:input path = "name" class="form-control" />
                <form:input path = "password" class="form-control" />
                <input type="submit" value="Login" class="btn btn-md btn-primary btn-block" />
            </form:form>
        </div>
    </body>
</html>
