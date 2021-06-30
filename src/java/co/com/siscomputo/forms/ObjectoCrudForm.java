/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.siscomputo.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.upload.MultipartRequestHandler;

/**
 *
 * @author SISCOMPUTO
 */
public class ObjectoCrudForm extends ActionForm{
                    // capsulas
                    private String tiposolicitud;
                    private String tipoidentificacion;
                    private Integer numeroidentificacion;
                    private String primernombre;
                    private String primerapellido;
                    private String segundonombre;
                    private String segundoapellido;
                    private String correoeletronico;
                    private String confirmacioncorreo;
                    private Integer reserva; 
                    private String ciudad;
                    private String direccion;
                    private Integer telefono;
                    private String detalle;
                    private Integer id;
                        //metodo que siempre se invoca cuando se crea un objeto de la misma clase
                    /*
    public ObjectoCrudForm(String tiposolicitud, String tipoidentificacion, Integer numeroidentificacion, String primernombre, String primerapellido, String segundonombre, String segundoapellido, String correoeletronico, String confirmacioncorreo, Integer reserva, String ciudad, String direccion, Integer telefono, String detalle, Integer id) {
        this.tiposolicitud = tiposolicitud;
        this.tipoidentificacion = tipoidentificacion;
        this.numeroidentificacion = numeroidentificacion;
        this.primernombre = primernombre;
        this.primerapellido = primerapellido;
        this.segundonombre = segundonombre;
        this.segundoapellido = segundoapellido;
        this.correoeletronico = correoeletronico;
        this.confirmacioncorreo = confirmacioncorreo;
        this.reserva = reserva;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.detalle = detalle;
        this.id = id;
    }*/
                    
                    //get me muestra o obtiene los datos 
    public String getTiposolicitud() {
        return tiposolicitud;
    }
                    //set me establece el dato
    public void setTiposolicitud(String tiposolicitud) {
        this.tiposolicitud = tiposolicitud;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public Integer getNumeroidentificacion() {
        return numeroidentificacion;
    }

    public void setNumeroidentificacion(Integer numeroidentificacion) {
        this.numeroidentificacion = numeroidentificacion;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getCorreoeletronico() {
        return correoeletronico;
    }

    public void setCorreoeletronico(String correoeletronico) {
        this.correoeletronico = correoeletronico;
    }

    public String getConfirmacioncorreo() {
        return confirmacioncorreo;
    }

    public void setConfirmacioncorreo(String confirmacioncorreo) {
        this.confirmacioncorreo = confirmacioncorreo;
    }

    public Integer getReserva() {
        return reserva;
    }

    public void setReserva(Integer reserva) {
        this.reserva = reserva;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ActionServlet getServlet() {
        return servlet;
    }

    public void setServlet(ActionServlet servlet) {
        this.servlet = servlet;
    }

    public MultipartRequestHandler getMultipartRequestHandler() {
        return multipartRequestHandler;
    }

    public void setMultipartRequestHandler(MultipartRequestHandler multipartRequestHandler) {
        this.multipartRequestHandler = multipartRequestHandler;
    }

    
    

    
    
}
