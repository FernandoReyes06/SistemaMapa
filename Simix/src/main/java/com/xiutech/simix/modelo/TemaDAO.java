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
public class TemaDAO extends AbstractDAO<Tema>{
    public TemaDAO(){
        super();
    }
    
    /**
     * Agrega un Tema en la base.
     * @param tema El tema a añadir
     */
    @Override
    public void save(Tema tema){
        super.save(tema);
    }
    
    /**
     * Actualiza un Tema en la base.
     * @param tema El tema a actualizar
     */
    @Override
    public void update(Tema tema){
        super.update(tema);
    }
    
    /**
     * Elimina un Tema en la base.
     * @param tema El tema a eliminar
     */
    @Override
    public void delete(Tema tema){
        super.delete(tema);
    }
    
    /**
     * Consulta un Tema en la base.
     * @param tema El tema a consultar
     * @return  El Tema construido con datos en la base. Null si no existe.
     */
    public Tema find(String nombre){
        return super.find(Tema.class, nombre);
    }
    
    /**
     * Consulta de todos los temas en la base.
     * @return Una lista de los temas en la base.
     */
    public List<Tema> findAll(){
        return super.findAll(Tema.class);
    }
}
