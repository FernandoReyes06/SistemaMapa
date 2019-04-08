/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.modelo;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase abstracto para acceso de datos en la base.
 * Provee los métodos generales para ABMC de objetos.
 * @author fercho117
 */
public abstract class AbstractDAO<T> {
    
    protected SessionFactory sessionFactory;
    
    /**
     * Constructor por default.
     */
    public AbstractDAO(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    
    /**
     * Agrega un objeto de tipo T (generico) en la base.
     * @param obj El objeto a agregar.
     */
    protected void save(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
             session.save(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        
        
    }
    
    /**
     * Actualiza un objeto de tipo T (generico) en la base.
     * @param obj El objeto a actualizar.
     */
    protected void update(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null)
                tx.rollback();
        }finally{
            session.close();
        }
    }
    
    /**
     * Elimina un objeto de tipo T (generico) en la base.
     * @param obj El objeto a eliminar.
     */
    protected void delete(T obj){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.update(obj);
            tx.commit();
        }catch(HibernateException e){
            if(tx!=null)
                tx.rollback();
        }finally{
            session.close();
}
    }
    
    /**
     * Consulta un objeto de cierta clase en la base.
     * @param clazz La clase de objeto del que se trata
     * @param id El identificador de dicho objeto en la base.
     * @return El objeto en tipo T de java.
     */
    protected T find(Class clazz, Serializable id){
        T obj = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            obj = (T) session.get(clazz, id);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return obj;
    }
    
    /**
     * Obtiene todos los elementos de cierta clase en la base.
     * @param clazz La clase/entidad que se quiere consultar.
     * @return Una lista de todas las instancias de la clase en la base.
     */
    protected List<T> findAll(Class clazz){
        List<T> obj = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "From"+clazz;
            Query query = session.createQuery(hql);
            obj = (List<T>) query.list();
            tx.commit();
        }catch(HibernateException e){
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
        }
        return obj;
    }
}
