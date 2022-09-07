<%@ page import="com.example.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%
    if(application.getAttribute("db")==null){
        DB db = new DB();
        application.setAttribute("db",db);
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Student Feedback</title>
    <link rel="stylesheet" href="MStyle.css">
</head>
<body >
<center><h1><%= "Student Feedback" %></h1></center>
<br/>

<center><div class="myDiv">
    <form method="post" action="Feedback">

        <div class="col-75">
        <samp>Student ID</samp><br>
        <input type="text" name="id" placeholder="Enter Student ID"required/> <br><br>
        </div>

        <div class="col-75">
        <samp>Student Name</samp><br>
        <input type="text" name="name" placeholder="Enter Student Name"required/><br><br>
        </div>

        <div class="col-75">
        <samp>Email</samp><br>
        <input type="text" name="email" placeholder="Enter Email"  required/><br><br>
        </div>

        <div class="col-75">
        <samp>Comments</samp><br>
        <textarea id="comment" name="comment" placeholder="Write something.." style="height:200px" required></textarea><br><br>
        </div>

        <input type="Submit" value="Submit" onClick="Summary.jsp'"><br><br>
    </form>
</div></center>

</body>
</html>