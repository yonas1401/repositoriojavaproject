<%-- 
    Document   : resultadoActualizar
    Created on : 21/06/2021, 02:53:46 PM
    Author     : SISCOMPUTO
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario actualizado</title>
    </head>
    <body>
        <html:form action="/FormularioCRUD">
            <logic:present name="objectoCrudForm" property="tiposolicitud">
            tipo solicitud:    <bean:write name="objectoCrudForm" property="tiposolicitud"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="tipoidentificacion">
              tipo identificacion:  <bean:write name="objectoCrudForm" property="tipoidentificacion"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="numeroidentificacion">
               numero de identificacion: <bean:write name="objectoCrudForm" property="numeroidentificacion"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="primernombre">
               primer nombre: <bean:write name="objectoCrudForm" property="primernombre"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="primerapellido">
               primer apellido: <bean:write name="objectoCrudForm" property="primerapellido"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="segundonombre">
               segundo nombre: <bean:write name="objectoCrudForm" property="segundonombre"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="segundoapellido">
               segundo apellido: <bean:write name="objectoCrudForm" property="segundoapellido"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="correoeletronico">
               Correo electronico: <bean:write name="objectoCrudForm" property="correoeletronico"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="confirmacioncorreo">
               confirmacion correo: <bean:write name="objectoCrudForm" property="confirmacioncorreo"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="reserva">
              reserva:  <bean:write name="objectoCrudForm" property="reserva"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="ciudad">
               ciudad: <bean:write name="objectoCrudForm" property="ciudad"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="direccion">
               direccion: <bean:write name="objectoCrudForm" property="direccion"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="telefono">
               telefono: <bean:write name="objectoCrudForm" property="telefono"/>                
            </logic:present>
            <logic:present name="objectoCrudForm" property="detalle">
               detalle: <bean:write name="objectoCrudForm" property="detalle"/>                
            </logic:present>
        </html:form>
    </body>
</html>
