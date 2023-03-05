<%@ page import="akz.dao.UserDao,akz.models.User,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<jsp:include page="navbar.jsp"/>
<h1 style="text-align: center">Edit Profile</h1>
<%
    UserDao userDao = new UserDao();
    User user = userDao.getUserbyid(Integer.valueOf(request.getParameter("iduser")));

%>

<div class="container">
    <form action="/user/update" method="post">
        <div class="form-group">
            <label for="iduser">ID</label>
            <input type="hidden" name="iduser" value="<%= user.getIduser() %>">
            <input tye="number" class="form-control" id="iduser" name="iduser" value="<%= user.getIduser() %>" disabled="disabled" >
        </div>

        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name" value="<%= user.getName() %>">
        </div>

        <div class="form-group">
            <label for="mail">Email</label>
            <input type="email" class="form-control" id="mail" aria-describedby="emailHelp" name="mail" value="<%= user.getMail() %>">
        </div>

        <div class="form-group">
            <label for="phone">Phone</label>
            <input type="number" class="form-control" id="phone" name="phone" value="<%= user.getPhone() %>">
        </div>

        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address" value="<%= user.getAddress() %>">
        </div>

        <button type="submit" class="btn btn-primary">Update</button>

    </form></div>
<jsp:include page="footer.jsp"/>