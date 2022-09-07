package com.example.servlet;



import com.example.controller.DB;
import com.example.module.Students;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Feedback", value = "/Feedback")
public class Feedback extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String comment = request.getParameter("comment");

        ServletContext sc= request.getServletContext();

        if (sc.getAttribute("db")!=null){
            DB db =(DB) sc.getAttribute("db");

            if (db.already(id)==false){

                Students students = new Students(id,name,email,comment);
                System.out.println(db.add(students));
                response.sendRedirect("/Summary.jsp");

            }else{
                System.out.println("Feedback Already Submitted");
            }
        }

        System.out.println(id +" "+ name +" "+ email+ " "+ comment);
    }
}
