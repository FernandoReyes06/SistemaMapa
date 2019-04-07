/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.controlador;

import com.xiutech.simix.modelo.Informador;
import com.xiutech.simix.modelo.InformadorDAO;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author jhovangallardo
 */

@ManagedBean
public class ABInformadorController {
    private String nombre;
    private String correo;
    private String contrasenia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    private void generarContrasenia(){
        this.setContrasenia("ejemploContrasenia");
    }
        
    public void darAltaInformador(){
        Informador i = new Informador();
        i.setNombre(nombre);
        i.setCorreo(correo);
        i.setContrasenia(contrasenia);
        InformadorDAO udb = new InformadorDAO();
        udb.save(i);
    }
}
