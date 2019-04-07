/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.controlador;

import com.xiutech.simix.modelo.Informador;
import com.xiutech.simix.modelo.InformadorDAO;
import com.xiutech.simix.modelo.Marcador;
import com.xiutech.simix.modelo.MarcadorDAO;
import com.xiutech.simix.modelo.Tema;
import com.xiutech.simix.modelo.TemaDAO;
import java.awt.Color;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/**
 *
 * @author fercho117
 */
@ManagedBean
public class ABTemaPropioController {
    private String nombre;
    private String color;
    
    public ABTemaPropioController(){
        Random random = new Random();
        Color col = new Color(random.nextInt(), random.nextInt(), random.nextInt());
        this.color = col.toString();
    }
    
    public ABTemaPropioController(String nombre){
        this.nombre = nombre;
    }    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    //Tal vez sea necesario modificar flujo de eventos.
    public void agregaTema(){
        Tema tema = new Tema(nombre, color);
        //if(marcadores.isEmpty())
            //error
        TemaDAO udbT = new TemaDAO();
        InformadorDAO infDAO = new InformadorDAO();        
        MarcadorDAO udbM = new MarcadorDAO();
        // La siguiente línea es para obtener correo.
        //ControladorSesion.UserLogged us= (ControladorSesion.UserLogged) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
        String correo_ejemplo = ""; //Solo para prueba individual
        Informador informador = infDAO.find(correo_ejemplo); //(us.getCorreo())
        tema.setInformador(informador);
        udbT.save(tema);
        //pasar a caso de uso AMarcador
    }

    /**
    private void verificaDatos(){
    }
    
    public void agregaMarcador(Marcador marcador){
        
    }
    **/
}
