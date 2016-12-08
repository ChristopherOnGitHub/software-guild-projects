<div class="navbar">
    <ul class="nav nav-tabs">
        <li role="presentation"><a href="${pageContext.request.contextPath}/home">Home</a></li>
        <sec:authorize access="isAnonymous()">
            <li role="presentation"><a href="${pageContext.request.contextPath}/login">Login</a></li>
        </sec:authorize>
        <sec:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_USER')">
            <li role="presentation"><a href="${pageContext.request.contextPath}/adminOnly">Admin Only</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/userOnly">User Only</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/adminOrUser">Users AND Admins</a></li>
        </sec:authorize>
        <sec:authorize access="isAuthenticated()">
            <li role="presentation"><a href="${pageContext.request.contextPath}/anyAuthed">Someone W/ a Role</a></li>
            <li role="presentation"><a href="${pageContext.request.contextPath}/j_spring_security_logout">Logout</a></li>
        </sec:authorize>
    </ul>    
</div>