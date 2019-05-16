/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dac.tads.dao;

import com.dac.tads.model.Usuario;
import com.dac.tads.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marco
 */
public class UsuarioDAO {
    
    
    public boolean insertUsuario(Usuario usuario) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(usuario);
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    // Retornará um único usuario
    public Usuario selectUsuario(int id) {
        Usuario usuario = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery(
                    "from Usuario where Usuario.id = :id");
            query.setInteger("id", id);
            usuario = (Usuario) query.uniqueResult();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return usuario;
    }
    
    // Retorna uma lista de todos os usuarios
    public List<Usuario> selectListUsuario() {
        List<Usuario> usuarios;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from Usuario");
            usuarios = query.list();
            session.getTransaction().commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
        return usuarios;
    }
    
    // Retorna um boolean em relação ao resultado do update
    public boolean updateUsuario(Usuario usuario) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(usuario);
            session.getTransaction().commit();
            session.clear();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    // Retorna um boolean em relação a deleção de um usuario
    public boolean deleteUsuario(Usuario usuario) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            session.delete(usuario);
            tx.commit();
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
