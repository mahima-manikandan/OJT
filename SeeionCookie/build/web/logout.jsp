<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page import="jakarta.servlet.http.HttpServletResponse" %>
<%@ page import="jakarta.servlet.http.HttpServletRequest" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout</title>
    </head>
    <body>
        <%
            // Invalidate the session
            session.invalidate();
            
            // Remove the 'uname' cookie if it exists
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("uname")) {
                        cookie.setValue(null);
                        cookie.setMaxAge(0); // Expire the cookie
                        response.addCookie(cookie);
                        break;
                    }
                }
            }
        %>
        <h1>You have been logged out successfully.</h1>
        <a href="login.html">Login</a>
    </body>
</html>
