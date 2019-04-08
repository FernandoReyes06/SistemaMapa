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
public class ComentarioDAO extends AbstractDAO<Comentario>{
      
    public ComentarioDAO(){
        super();
    }
    
    @Override
    public void save(Comentario comentario){
        super.save(comentario);
    }
    
    
    @Override
    public void update(Comentario comentario){
        super.update(comentario);
    }
        
    @Override
    public void delete(Comentario comentario){
        super.delete(comentario);
    }
    
    public Comentario find(ComentarioId id){
        return super.find(Comentario.class, id);
    }
    
    public List<Comentario> findAll(){
        return super.findAll(Comentario.class);
    }
      
}

