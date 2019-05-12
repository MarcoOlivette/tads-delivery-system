/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author marco
 */

@Entity
@Named(value = "tb_cidade")
public class Cidade implements Serializable {
    private long cidade_id;
    private String cidade_nome;
    private long cidade_estado;
    private Estado estado = new Estado();

    public Cidade() {
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(long cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getCidade_nome() {
        return cidade_nome;
    }

    public void setCidade_nome(String cidade_nome) {
        this.cidade_nome = cidade_nome;
    }

    public long getCidade_estado() {
        return cidade_estado;
    }

    public void setCidade_estado(long cidade_estado) {
        this.cidade_estado = cidade_estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
}
