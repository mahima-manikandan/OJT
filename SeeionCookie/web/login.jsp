
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        
        <% 
            String uname = request.getParameter("username");
            String pwd = request.getParameter("password");
            
            // authenticate
            if("mahima".equals(uname) && "1234".equals(pwd)){
               // create a session and set the username attribute
               session.setAttribute("username", uname);
               
               //create a cookie to store the username
               Cookie userCookie = new Cookie("username",uname);
               userCookie.setMaxAge(60*60*24); // 1 day
               response.addCookie(userCookie);
               
               response.sendRedirect("home.jsp");
                
            }
            
          
            else{ %>
            <h1> Login Failed/invalid Data</h1>
            <a href ="login.html">Try Again</a>
           <% } %>

    </body>
</html>
