<%-- 
    Document   : FormularioConsultar
    Created on : 24/06/2021, 10:41:15 AM
    Author     : SISCOMPUTO
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Datos</title>
    </head>
    <body>
        <html:form action="/FormularioCRUD">
         <%
            //CONECTANOD A LA BASE DE DATOS:
            Connection con;
            String url = "jdbc:mysql://localhost/diligencia";
            String Driver = "com.mysql.cj.jdbc.Driver";
            String user = "root";
            String clave = "root";
            Class.forName(Driver);
            con = DriverManager.getConnection(url, user, clave);
            PreparedStatement ps;
            //Emnpezamos Listando los Datos de la Tabla Usuario
            Statement smt;
            ResultSet rs;
            smt = con.createStatement();
            rs = smt.executeQuery("select * from solicitud");
            //Creamo la Tabla:     
        %>
        
        <h1 class="text-center">tabla de datos </h1>
 
        <table class="table table-bordered table-sm">
            <tr>
                <td class="text-center">Tiposolicitud</td>
                <td class="text-center">Tipodocumento</td>
                <td class="text-center">Numerodocumento</td>
                <td class="text-center">Primernombre</td>
                <td class="text-center">Primerapellido</td>
                <td class="text-center">Segundonombre</td>
                <td class="text-center">Segundoapellido</td>
                <td class="text-center">Correoelectronico</td>
                <td class="text-center">Confirmacioncorreo</td>
                <td class="text-center">Reserva</td>
                <td class="text-center">Ciudad</td>
                <td class="text-center">Direccion</td>
                <td class="text-center">Telefono</td>
                <td class="text-center">Detalle</td>
                <td class="text-center">Id</td>
                <td class="text-center">accion</td>
            </tr>
            <% 
                    while(rs.next()){
            %>
            <tr>
                <td class="text-center"><%= rs.getString("Tiposolicitud")%></td>
                <td class="text-center"><%= rs.getString("Tipoidentificacion")%></td>
                <td class="text-center"><%= rs.getInt("Numeroidentificacion")%></td>
                <td class="text-center"><%= rs.getString("Primernombre")%></td>
                <td class="text-center"><%= rs.getString("Primerapellido")%></td>
                <td class="text-center"><%= rs.getString("Segundonombre")%></td>
                <td class="text-center"><%= rs.getString("Segundoapellido")%></td>
                <td class="text-center"><%= rs.getString("Correoeletronico")%></td>
                <td class="text-center"><%= rs.getString("Confirmacioncorreo")%></td>
                <td class="text-center"><%= rs.getInt("Reserva")%></td>
                <td class="text-center"><%= rs.getString("Ciudad")%></td>
                <td class="text-center"><%= rs.getString("Direccion")%></td>
                <td class="text-center"><%= rs.getInt("Telefono")%></td>
                <td class="text-center"><%= rs.getString("Detalle")%></td>
                <td class="text-center"name="idtabla"><%= rs.getInt("id")%></td>
                <td class="text-center">
                    <input name="metodo" type="hidden" value="eliminar"> 
                    <button class="btn btn-danger" type="submit">eliminar</button> 
                </td>
                
                <%}%>
                
               
                                                              
            </tr>
            
            
            
            
        </table>
    </html:form>           
    </body>
</html>
