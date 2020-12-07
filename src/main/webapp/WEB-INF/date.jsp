<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
        <title>Date</title>
        <link rel="stylesheet" type="text/css" href="css/date.css">
        <script type="text/javascript" src="js/date.js"></script>
</head>
<body>
        <h1>
			<c:out value="${day}, the ${daynum} of ${month}, ${year}" />
        </h1>
        
</body>
</html>