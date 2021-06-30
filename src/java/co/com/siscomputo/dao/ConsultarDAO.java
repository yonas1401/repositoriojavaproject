/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.siscomputo.dao;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SISCOMPUTO
 */
public class ConsultarDAO {
        public String consultarDB(
                
                
        )throws SQLException, ClassNotFoundException
        {
         String rta = "";
                    
                    Conexion conexion = new Conexion();
                    Connection conn = conexion.obtener();
                     try {
                     
                         String sql = "select * from solicitud;";
                         
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
                     
        }
