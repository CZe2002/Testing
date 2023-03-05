<%@ page import="akz.dao.UserDao,akz.models.User,java.util.List" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>

<jsp:include page="navbar.jsp"/>
<h1 style="text-align: center">All User</h1>

<%
    UserDao dao= new UserDao();
    List<User> users=dao.getAllUsers();
    request.setAttribute("users", users);
%>
<div class="container">
    <a href="/user/create">Add New User</a>


    <table border="1" width="100%">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.getIduser()}</td>
                <td>${u.getName()}</td>
                <td>${u.getMail()}</td>
                <td>${u.getPhone()}</td>
                <td>${u.getAddress()}</td>
                <td><a href="/user/delete?iduser=${u.getIduser()}">Delete</a></td>
                <td><a href="/user/edit?iduser=${u.getIduser()}">Edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<jsp:include page="footer.jsp"/>