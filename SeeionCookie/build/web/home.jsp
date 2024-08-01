<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
       <% 
         // Retrieve the session attribute
         String uname = (String) session.getAttribute("username");
         
         if(uname == null){
              Cookie[] cookies = request.getCookies();
              if(cookies != null){
                  for(Cookie cookie : cookies){
                      if(cookie.getName().equals("uname")){
                          uname = cookie.getValue();
                          session.setAttribute("username", uname);
                          break;
                      }
                  }
              }
           }
           
           if(uname != null){
       %>
       <h1> Welcome, <%= uname %> </h1>
       <a href="logout.jsp">Logout</a>
       <% 
           } else {
       %>
       <h1> You are not logged in!</h1>
       <a href="login.html">Login</a>
       <% 
           }
       %>
    </body>
</html>
