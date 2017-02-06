<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
<title>Spring Pizza</title>
</head>

<body>
	<h2>createCountRequest.jsp</h2>

	<form:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		Location:<input type="text" name="location" />
		<br />
		<input type="submit" name="_eventId_countRequestCreated"
			value="Create Count Request" />
	</form:form>
</body>
</html>