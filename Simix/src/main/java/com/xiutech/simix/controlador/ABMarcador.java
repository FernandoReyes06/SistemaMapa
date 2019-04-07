/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.controlador;

import com.xiutech.simix.modelo.Marcador;
import com.xiutech.simix.modelo.MarcadorDAO;
import com.xiutech.simix.modelo.Tema;
import javax.faces.context.FacesContext;

/**
 *
 * @author fercho117
 */
public class ABMarcador {
    private double longitud;
    private double latitud;
    private String descripcion;

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void agregaMarcador(){
        MarcadorDAO mdb =new MarcadorDAO();
        Marcador marcador = mdb.buscaPorCoord(latitud, longitud);
        /**
         * Envia mensaje de error, marcador repetido
         * if(m!= null){
            this.descripcion ="";
            Mensajes.fatal("Ya existe un marcador con estas cordenadas \n" +"Lat: "+this.latitud +" Lng: "+this.longitud);
            return "";
        }
        */
        marcador = new Marcador();
        marcador.setDescripcion(descripcion);
        marcador.setLatitud(latitud);
        marcador.setLongitud(longitud);
        mdb.save(marcador);
        //this.descripcion =""; why?
        //refresh
    }
    
    
}
