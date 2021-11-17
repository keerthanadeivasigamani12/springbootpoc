<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*"%>



<html>
<head>
<title>Welcome</title>
<body background="https://th.bing.com/th/id/R.a2372f6deacf24c9da826ddc6d0e7ff0?rik=o3vptlLwNI6Mtw&riu=http%3a%2f%2fwallpapersdsc.net%2fwp-content%2fuploads%2f2016%2f10%2fSunset-HD.jpg&ehk=ZlF9W%2bVKWFaiCid0LPPaJ9OzNVtmJCz25aLwSiX%2fGZo%3d&risl=&pid=ImgRaw&r=0" link="#000" alink="#017bf5" vlink="#000">
<h1 align="center"> Room Details</h1>



</head>
<body>



<table>
<tr><td>

</table>

<%
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/poc4","root","Keerthi@123");
Statement statement = connection.createStatement() ;
ResultSet resultset = statement.executeQuery("select * from hotelsroom ") ;
%>
<table BORDER="1" align="center">
<tr>
<th>Room number</th>
<th>Room type</th>
<th>Room status</th>
</tr>
<% while(resultset.next()){ %>
<tr>
<td> <%= resultset.getString(1) %></td>
<td> <%= resultset.getString(2) %></td>
<td> <%= resultset.getString(3) %></td>
</tr>
<% } %>
</table>

<table><br><br><br>
<tr></td><a href="view/index.jsp"><b>Logout</b></a></td></tr><br><br>

<a href="booking.jsp">Book Room</a>
</table>
</body>
</html>