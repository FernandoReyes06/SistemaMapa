/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.modelo;

import java.util.List;

/**
 *
 * @author fercho117
 */
public class CalificacionDAO extends AbstractDAO<Calificacion>{
      
    public CalificacionDAO(){
        super();
    }
    
    @Override
    public void save(Calificacion calificacion){
        super.save(calificacion);
    }
    
    
    @Override
    public void update(Calificacion calificacion){
        super.update(calificacion);
    }
        
    @Override
    public void delete(Calificacion calificacion){
        super.delete(calificacion);
    }
    
    public Calificacion find(CalificacionId id){
        return super.find(Calificacion.class, id);
    }
    
    public List<Calificacion> findAll(){
        return super.findAll(Calificacion.class);
    }
      
}

