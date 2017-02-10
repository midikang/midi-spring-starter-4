<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
<title>Spring Pizza</title>
</head>

<body>
	<h2>countTasksCompleteWithNoVariance.jsp</h2>
	<h3>Count Tasks Completed With No Variance</h3>
	<form:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<br />
		<input type="submit" name="_eventId_complete"
			value="Complete Variance Tasks" />
	</form:form>
</body>
</html>