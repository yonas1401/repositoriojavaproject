<%-- 
    Document   : Formulario
    Created on : 18/06/2021, 10:48:52 AM
    Author     : SISCOMPUTO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>FORMULARIO</title>
    </head>
    <body background="fondojsp.jpg">
        <html:form  action="/FormularioCRUD" >
            <h1 class="text-center"> Formulario </h1><br>
            <div class="container"class="col-xs-12" >
                <div class="row" class="center-block">
                    <div class="col" class="center-block">
                <select name="tiposolicitud" placeholder="Tiposolicitud" title="tiposolicitud" class="form-control form-control-lg" class="form-control form-control-lg">
            <option>queja</option>
            <option>Reclamo</option>
            <option>Peticion</option>
            <option>Solicitud</option>
            <option>Denuncia</option>
            <option>cambios y cancelaciones</option>
            <option>Retracto</option>
            <option>Desistimiento</option>
            <option>Reembolso</option>
            <option>Cruce de cuentas</option>
            <option>Reversion</option>
            </select><br>
                    </div>
             
                <div class="col" class="center-block">
        <select name="tipoidentificacion" placeholder="tipoidentificacion" title="tipoidentificacion" class="form-control form-control-lg" class="form-control form-control-lg">
            <option>CIN</option>
            <option> CURP</option>
            <option>CEDULA</option>
            <option>CEDULA JURIDICA</option>
            <option>CEDULA DE EXTRANJERIA</option>
            <option>DNI</option>
            <option>DPI</option>
            <option>DUI</option>
            <option>INE</option>
            <option>IDETIFICACION DEL EXTERIOR</option>
            <option>LICENCIA</option>
            <option>NIF</option>
            <option>NIT</option>
            <option>NO DISPONIBLE</option>
            <option>OCRE</option>
            <option>PASAPORTE</option>
            <option>RFC</option>
            <option>RFC NATURAL</option>
            <option>RIF</option>
            <option>RUC</option>
            <option>REGISTRO CIVIL</option>
            <option></option>
            <option></option>
            <option></option>
        </select><br>
                </div>
                    <div class="col">    <input name="numeroidentificacion" size="25" placeholder="Numerodidentificacion" title="Numeroidentificacion" class="form-control form-control-lg" ><br> </div>
                    <div class="col">    <input name="primernombre" size="25" placeholder="Primernombre" title="Primernombre" class="form-control form-control-lg" > <br></div>
                    <div class="col">   <input name="primerapellido" size="25" placeholder="Primerapellido" title="Primerapellido" class="form-control form-control-lg" ><br> </div>
                    <div class="col">   <input name="segundonombre" size="25" placeholder="Segundonombre" title="Segundonombre" class="form-control form-control-lg" ><br> </div>
                    <div class="col">  <input name="segundoapellido" size="25" placeholder="Segundoapellido" title="Segundoapellido" class="form-control form-control-lg" ><br> </div>
                    <div class="col">  <input name="correoeletronico" size="25" placeholder="Correoeletronico" title="Correoeletronico" class="form-control form-control-lg" ><br> </div>
                    <div class="col"> <input name="confirmacioncorreo" size="25" placeholder="Confirmacioncorreo" title="Confirmacioncorreo" class="form-control form-control-lg" ><br></div>
                    <div class="col">   <input name="reserva" size="25" placeholder="Reserva" title="Reserva" class="form-control form-control-lg" ><br> </div>
            <div class="col">
        <select name="ciudad" placeholder="Ciudad" title="Ciudad" class="form-control form-control-lg" class="form-control form-control-lg">
            <option>ACANDI</option>
            <option> ACARICUARA</option>
            <option>AGUACHICA</option>
            <option>AGUA CLARA</option>
            <option>AMALFI</option>
            <option>ANDES</option>
            <option>APARTADO</option>
            <option>APIAY</option>
            <option>ARARACUARA</option>
            <option>ARAUCA</option>
            <option>ARAUQUITA</option>
            <option>ARBOLETES</option>
            <option>ARICA</option>
            <option>ARMENIA</option>
            <option>AYACUCHO</option>
            <option>AYAPEL</option>
            <option>BAHIA CUPIDA</option>
            <option>BAHIA SOLANO</option>
            <option>BARRANCA DE UPIA</option>
            <option>BARRACABERMEJA</option>
            <option>BARRACONLINAS</option>
            <option>BOGOTA</option>
            <option>CALI</option>
            <option>CARTAGENA</option>
            <option>CUNDINAMARCA</option>
            <option>EL YOPAL</option>
            <option>FLORENCIA</option>
            <option>FLORIDA BLANCA</option>
            <option>GIRARDOT</option>
            <option>IBAGUE</option>
            <option>LETICIA</option>
            <option>MEDELLIN</option>
            <option>MONTERIA</option>
            <option>MOSQUERA</option>
            <option>MADRID</option>
            <option>NEIVA</option>
            <option>PALMIRA</option>
            <option>PASTO</option>
            <option>PEREIRA</option>
            <option>SAN ANDRES</option>
            <option>SEVILLA</option>
            <option>TRINIDAD</option>
            <option>VALLEDUPAR</option>
            <option>VILLAVICENCIO</option>
            <option>YUMBO</option>
            <option>ZAPATOCA</option>
        </select><br>
            </div>
                    <div class="col">  <input name="direccion" size="25" placeholder="Direccion" title="Direccion" class="form-control form-control-lg"><br></div>
                    <div class="col"> <input name="telefono" size="25" placeholder="Telefono" title="Telefono" class="form-control form-control-lg"><br><br></div>
                    <div class="col">  <input name="detalle" size="60" placeholder="Detalle" title="Detalle" class="form-control form-control-lg"><br></div>
                                        <input name="metodo" type="hidden" value="insertar"> 
                                        <div class="col"> <button type="submit" type="button" class="btn btn-outline-dark">ENVIAR </button> </div><br>
            
                    <div class="col"> <a class="btn btn-primary" href="Formularioactualizar.jsp">actualizar solicitud</a></div> <br>
                    <div class="col"> <a class="btn btn-primary" href="/Diligencia/resultados/ResultadoConsultar.jsp">consultar solicitud</a></div> <br>
                    <div class="col">  <a class="btn btn-primary" href="FormularioConsultar.jsp">eliminar solicitud</a></div>
                </div>
                </div>
        </html:form><br>
      
    </body>
</html>
