<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="pageTitle" value="Java education"/>

<html>
    <head>
        <title>${pageTitle}</title>
    </head>

    <body>
        <div class="container">
            Hello , ${NAME} ${sessionScope.NAME}!
        </div>
    </body>
</html>
