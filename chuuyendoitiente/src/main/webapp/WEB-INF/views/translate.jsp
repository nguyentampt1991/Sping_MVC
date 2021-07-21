<%--
  Created by IntelliJ IDEA.
  User: Tam Nguyen
  Date: 7/21/2021
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="translate-result">
    <input type="text" name="name" placeholder="Enter to your word :..." >
    <input type="submit" value="Search">

    <c:catch var="exception">
        <h3>${requestScope["translate-result"]}</h3>
    </c:catch>

</form>
</body>
</html>
