<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
<title>Spring Pizza</title>
</head>

<body>
	<h2>createCountTasks.jsp</h2>
	<h3>countRequestCreated</h3>
	<form:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<br />
		<input type="submit" name="_eventId_countTaskCreated"
			value="Create Count Tasks" />
	</form:form>
</body>
</html>