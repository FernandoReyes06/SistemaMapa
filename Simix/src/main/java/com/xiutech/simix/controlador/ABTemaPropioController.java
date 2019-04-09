/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.controlador;

import com.xiutech.simix.modelo.Informador;
import com.xiutech.simix.modelo.InformadorDAO;
import com.xiutech.simix.modelo.Tema;
import com.xiutech.simix.modelo.TemaDAO;
import java.awt.Color;
import java.util.Random;
import javax.faces.bean.ManagedBean;
/**
 * Controlador para alta/baja de temas en el sistema. 
 * Primera iteracion solo incluye alta
 * @author fercho117
 * @version 06/04/19 
 */
@ManagedBean
public class ABTemaPropioController {    
    private String nombre;
    
    /**
     * Constructor por default. Se genera un color aleatorio para el tema.
     */
    public ABTemaPropioController(){
    }
    
    /**
     * Obtener el nombre del tema.
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar el nombre del tema.
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Agrega un tema a la base.
     */
    public String agregaTema(){
        TemaDAO udbT = new TemaDAO();
        InformadorDAO infDAO = new InformadorDAO();        
        // La siguiente línea es para obtener correo.
        //ControladorSesion.UserLogged us= (ControladorSesion.UserLogged) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("user");
        Informador informador = infDAO.find("ejemplo@gmail.com"); //(us.getCorreo())
        Tema tema = udbT.find(nombre);
        //if(tema != null)
            //error: ya existe
        String color = generaColor();
        tema = new Tema(nombre, color);
        tema.setInformador(informador);
        udbT.save(tema);
        return "/informador/agregaMarcador?faces-redirect=true";
    }

    private String generaColor(){
        Random random = new Random();
        Color col = new Color(random.nextInt(255), random.nextInt(255),random.nextInt(255));
        return col.toString();
    }
    
}
