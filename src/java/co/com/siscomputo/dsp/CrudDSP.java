/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.siscomputo.dsp;

import co.com.siscomputo.dao.CampoDao;
import co.com.siscomputo.forms.ObjectoCrudForm;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.lang.String;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

/**
 *
 * @author SISCOMPUTO
 */
public class CrudDSP extends DispatchAction{
    
                public ActionForward insertar(
                        ActionMapping mapping,
                        ActionForm form,
                        HttpServletRequest request,
                        HttpServletResponse response
            ) throws IOException {    

                    ObjectoCrudForm objeto = new ObjectoCrudForm();
                    String rta="";
                    try {
                    
                    
                        CampoDao dao = new CampoDao();
                        
                        objeto = (ObjectoCrudForm) form;
                        
                        dao.InsertarCampo(objeto);
                        
                        if(objeto != null){
                        out.println("ok");
                        }else{
                            out.println("error al insertar los datos");       
                        }
                    PrintWriter out = response.getWriter();
                    out.print(rta);
                    out.flush();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                     }            
                    return mapping.findForward("resultadoInserta");
                }
                
            public ActionForward actualizar(
                        ActionMapping mapping,
                        ActionForm form,
                        HttpServletRequest request,
                        HttpServletResponse response
            ) throws IOException {   
                
                   ObjectoCrudForm objeto1 = new ObjectoCrudForm();
                    String rta="";
                    
                    try {
                          CampoDao dao = new CampoDao();
                                                    
                          
                          objeto1 = (ObjectoCrudForm) form;
                          
                          dao.ActualizarCampo(objeto1);
                          
                          
                          
                        if(objeto1 != null){
                        out.println("ok");
                        }else{
                            out.println("error al insertar los datos");       
                        }
                    PrintWriter out = response.getWriter();
                    out.print(rta);
                    out.flush();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }            
                    return mapping.findForward("actualizar");
                }
            
                        public ActionForward eliminar(
                        ActionMapping mapping,
                        ActionForm form,
                        HttpServletRequest request,
                        HttpServletResponse response
            ) throws IOException {
                            
                    ObjectoCrudForm objeto2 = new ObjectoCrudForm();
                    String rta="";
                    objeto2.setId(3);
               try {
                     CampoDao dao = new CampoDao();
                     
                     rta = dao.EliminarCampo(objeto2);
                     
               if(objeto2 != null){
                        out.println("ok");
                        }else{
                            out.println("error al eliminar los datos");       
                        }
                    PrintWriter out = response.getWriter();
                    out.print(rta);
                    out.flush();
                                
                            } catch (Exception e) {
                            }
                        
                       return mapping.findForward("eliminarcamp");
                        }
               public ActionForward consultar(
                        ActionMapping mapping,
                        ActionForm form,
                        HttpServletRequest request,
                        HttpServletResponse response
            ) throws IOException {
                  ;
                    String rta="";
                        
               try {
                     CampoDao dao = new CampoDao();
                     ObjectoCrudForm objeto3 = new ObjectoCrudForm();
                      ArrayList<ObjectoCrudForm> lista = dao.consultarCampo(objeto3);
             
               if(objeto3 != null){
                        out.println("ok");
                        }else{
                            out.println("error al consultar los datos");       
                        }
                    PrintWriter out = response.getWriter();
                    Gson gson = new Gson();
                    rta = gson.toJson(lista);
                   out.print(rta);
                    out.flush();
                                
                            } catch (Exception e) {
                            }
                        
                       return mapping.findForward("consultarcampo");
                        }
                
}
    
 
