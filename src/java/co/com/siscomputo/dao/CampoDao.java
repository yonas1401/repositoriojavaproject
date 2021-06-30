/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.siscomputo.dao;

import Conexion.Conexion;
import co.com.siscomputo.forms.ObjectoCrudForm;
//import TO.CampoTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SISCOMPUTO
 */
public class CampoDao {

    /**
     *
     * 
     * 
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public String InsertarCampo(     
          ObjectoCrudForm objinsertar
            ) throws SQLException, ClassNotFoundException
                {
                    String rta = "";
                    
                    Conexion conexion = new Conexion();
                    Connection conn = conexion.obtener();
                     try {
                         String sql = "INSERT INTO solicitud (`Tiposolicitud`, `Tipoidentificacion`, `Numeroidentificacion`, `Primernombre`, `Primerapellido`, `Segundonombre`, `Segundoapellido`, `Correoeletronico`, `Confirmacioncorreo`, `Reserva`, `Ciudad`, `Direccion`, `Telefono`, `Detalle`) VALUES ('"+objinsertar.getTiposolicitud()+"','"+objinsertar.getTipoidentificacion()+"',"+objinsertar.getNumeroidentificacion()+",'"+objinsertar.getPrimernombre()+"','"+objinsertar.getPrimerapellido()+"','"+objinsertar.getSegundonombre()+"','"+objinsertar.getSegundoapellido()+"','"+objinsertar.getCorreoeletronico()+"','"+objinsertar.getConfirmacioncorreo()+"','"+objinsertar.getReserva()+"','"+objinsertar.getCiudad()+"','"+objinsertar.getDireccion()+"','"+objinsertar.getTelefono()+"','"+objinsertar.getDetalle()+"')";
                         Statement st = conn.createStatement();
                         st.executeUpdate(sql);
                         
                         rta = "insertado correctamente";
                        
                    } catch (SQLException e) {
                        rta = "error";
                        e.printStackTrace();
                    }finally{
                         
                         try{
                         
                             if(conn != null){
                                 conn.close();
                             
                             }
                         
                         } catch(Exception e){
                         
                         e.printStackTrace();
                         }
                     
                     }
            
                    return rta;
                   
            }
    public String ActualizarCampo(
            ObjectoCrudForm objactualizar
     )throws SQLException, ClassNotFoundException
                {
                    objactualizar.setId(18);
                    String rta = "";
                    
                    Conexion conexion = new Conexion();
                    Connection conn = conexion.obtener();
                     try {
                     
                         String sql = "UPDATE solicitud SET Tiposolicitud='"+objactualizar.getTiposolicitud()+"',Tipoidentificacion='"+objactualizar.getTipoidentificacion()+"',Numeroidentificacion="+objactualizar.getNumeroidentificacion()+",Primernombre='"+objactualizar.getPrimernombre()+"',Primerapellido='"+objactualizar.getPrimerapellido()+"',Segundonombre='"+objactualizar.getSegundonombre()+"',Segundoapellido='"+objactualizar.getSegundoapellido()+"',Correoeletronico='"+objactualizar.getCorreoeletronico()+"',Confirmacioncorreo='"+objactualizar.getConfirmacioncorreo()+"',Reserva="+objactualizar.getReserva()+",Ciudad='"+objactualizar.getCiudad()+"',Direccion='"+objactualizar.getDireccion()+"',Telefono="+objactualizar.getTelefono()+",Detalle='"+objactualizar.getDetalle()+"' WHERE id="+objactualizar.getId()+"";
                         
                         Statement st = conn.createStatement();
                         st.executeUpdate(sql);
                         
                         rta = "actualizado correctamente";
                        
                    } catch (Exception e) {
                        rta = "error";
                        e.printStackTrace();
                    }finally{
                         
                         try{
                         
                             if(conn != null){
                                 conn.close();
                             
                             }
                         
                         } catch(Exception e){
                         
                         e.printStackTrace();
                         }
                     
                     }
            
                    return rta;
                   
            }
    


    
        public String EliminarCampo(
                  ObjectoCrudForm objeliminar
    ) throws SQLException, ClassNotFoundException
                {
                
                   
                    String rta = "";
                    
                    Conexion conexion = new Conexion();
                    Connection conn = conexion.obtener();
                     try {
                         
                         String sql = "delete from solicitud where  id ="+objeliminar.getId();
                         Statement st = conn.createStatement();
                         st.executeUpdate(sql);
                         
                         rta = "eliminado correctamente";
                        
                    } catch (Exception e) {
                        rta = "error";
                        e.printStackTrace();
                    }finally{
                         
                         try{
                         
                             if(conn != null){
                                 conn.close();
                             
                             }
                         
                         } catch(Exception e){
                         
                         e.printStackTrace();
                         }
                     
                     }
            
                    return rta;
                    
                    
                }

  public ArrayList<ObjectoCrudForm> consultarCampo(ObjectoCrudForm objconsultar) throws SQLException, ClassNotFoundException{
     
     ArrayList<ObjectoCrudForm> lista = null;
     Conexion conexion = new Conexion();
     Connection conn =  conexion.obtener(); 
         try {
             
             
             String sql = "select Tiposolicitud, Tipoidentificacion, Numeroidentificacion, Primernombre, Primerapellido, Segundonombre, Segundoapellido, Correoeletronico, Confirmacioncorreo, Reserva, Ciudad, Direccion, Telefono, Detalle from solicitud";
             Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery(sql);
              while (rs.next()){
                  if(lista == null){
                        
                        lista = new ArrayList<>();
                    
                  }
             ObjectoCrudForm aux = new ObjectoCrudForm();
              aux.setTiposolicitud(rs.getNString("Tiposolicitud"));
              aux.setTipoidentificacion(rs.getNString("Tipoidentificacion"));
              aux.setNumeroidentificacion(rs.getInt("Numeroidentificacion"));
              aux.setPrimernombre(rs.getNString("Primernombre"));
              aux.setPrimerapellido(rs.getString("Primerapellido"));
              aux.setSegundonombre(rs.getString("Segundonombre"));
              aux.setSegundoapellido(rs.getString("Segundoapellido"));
              aux.setCorreoeletronico(rs.getString("Correoeletronico"));
              aux.setConfirmacioncorreo(rs.getString("Confirmaciocorreo"));
              aux.setReserva(rs.getInt("Primerapellido"));
              aux.setCiudad(rs.getString("Ciudad"));
              aux.setDireccion(rs.getString("Direccion"));
              aux.setTelefono(rs.getInt("Telefono"));
              aux.setDetalle(rs.getString("Detalle"));
              
              
              lista.add(aux);
              
              }
             
             
             
         } catch (Exception e) {
             e.printStackTrace();
         }  finally{
             try {
                if(conn != null){
                   // conexion.cerrar();
                   conn.close();
                } 
             } catch (Exception e) {
                 e.printStackTrace();
             }
         
         
         }
     return lista;
     
     }
    

}
       
    
       

  