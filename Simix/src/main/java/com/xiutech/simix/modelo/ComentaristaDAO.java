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
public class ComentaristaDAO extends AbstractDAO<Comentarista>{
      
    public ComentaristaDAO(){
        super();
    }
    
    @Override
    public void save(Comentarista comentarista){
        super.save(comentarista);
    }
    
    
    @Override
    public void update(Comentarista comentarista){
        super.update(comentarista);
    }
        
    @Override
    public void delete(Comentarista comentarista){
        super.delete(comentarista);
    }
    
    public Comentarista find(String correo){
        return super.find(Comentarista.class, correo);
    }
    
    public List<Comentarista> findAll(){
        return super.findAll(Comentarista.class);
    }
      
}
