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
public class AdministradorDAO extends AbstractDAO<Administrador>{
    
    public AdministradorDAO(){
        super();
    }
    
    @Override
    public void save(Administrador admin){
        super.save(admin);
    }
    
    
    @Override
    public void update(Administrador admin){
        super.update(admin);
    }
        
    @Override
    public void delete(Administrador admin){
        super.delete(admin);
    }
    
    public Administrador find(String correo){
        return super.find(Administrador.class, correo);
    }
    
    public List<Administrador> findAll(){
        return super.findAll(Administrador.class);
    }
    
}
