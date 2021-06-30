<%-- 
    Document   : ResultadoConsultar
    Created on : 29/06/2021, 03:09:00 PM
    Author     : SISCOMPUTO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html ng-app="appconsultar">
    <head>
        <script src="../angular.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../app.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <html:form action="/FormularioCRUD">
            
        <div ng-controller="controladorconsulta">
            <table>
                <tr>
                    <td>formularios de solicitud</td>
                </tr>
                <tr ng-repeat="item in Formulariosolicitud">
                    <td>Tipo de solicitud: </td>
                    <td>{{item.tiposolicitud}}</td>
                    <td>Tipo documento: </td>
                    <td>{{item.tipodocumento}}</td>
                    <td>Numero de documento: </td>
                    <td>{{item.numerodocumento}}</td>
                    <td>Primer nombre: </td>
                    <td>{{item.primernombre}}</td>
                    <td>Primer apellido: </td>
                    <td>{{item.primerapellido}}</td>
                    <td>Segundo nombre: </td>
                    <td>{{item.segundonombre}}</td>
                    <td>Segundo apellido: </td>
                    <td>{{item.segundoapellido}}</td>
                    <td>Correo electronico: </td>
                    <td>{{item.correoeletronico}}</td>
                    <td>Confirmacio correo: </td>
                    <td>{{item.confirmacioncorreo}}</td>
                    <td>Reserva: </td>
                    <td>{{item.reserva}}</td>
                    <td>Ciudad: </td>
                    <td>{{item.ciudad}}</td>
                    <td>Direccion: </td>
                    <td>{{item.direccion}}</td>
                    <td>Telefono: </td>
                    <td>{{item.telefono}}</td>
                    <td>Detalle: </td>
                    <td>{{item.detalle}}</td>
                 
                    
                </tr>
            </table>
            
        </div>
    </html:form>
    </body>
</html>
