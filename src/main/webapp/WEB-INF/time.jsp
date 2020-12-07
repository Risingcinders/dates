<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<title>Time</title>
<link rel="stylesheet" type="text/css" href="css/time.css">
<script type="text/javascript" src="js/time.js"></script>
</head>
<body>
	<h1>
		<c:out value="${hour}:${minute} ${half}" />
	</h1>

</body>
</html>