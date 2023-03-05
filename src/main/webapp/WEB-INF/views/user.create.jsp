<jsp:include page="header.jsp"/>
<jsp:include page="navbar.jsp"/>
<h1>User Create Page</h1>

<div class="container">
    <form action ="/user/create" method="get">
        <div class="form-group">

            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <div class="form-group">
            <label for="mail">Email</label>
            <input type="email" class="form-control" id="mail" aria-describedby="emailHelp" name="mail">
        </div>
        <div class="form-group">
            <label for="phone">Phone</label>
            <input type="text" class="form-control" id="phone" name="phone">
        </div>
        <div class="form-group">
            <label for="address">Address</label>
            <input type="text" class="form-control" id="address" name="address">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
<jsp:include page="footer.jsp"/>