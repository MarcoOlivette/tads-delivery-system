/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.inject.Named;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author marco
 */
@Entity
@Named(value = "tb_usuario")
public class Usuario implements Serializable {
    private long usuario_id;
    private String usuario_cpf;
    private String usuario_nome;
    private String usuario_telefone;
    private String usuario_email;
    private String usuario_senha;
    private long usuario_endereco;
    private char usuario_tipo;
    private Endereco endereco = new Endereco();
    private Entregador entregador = new Entregador();
    private Gerente gerente = new Gerente();

    public Usuario() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(long usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    public String getUsuario_cpf() {
        return usuario_cpf;
    }

    public void setUsuario_cpf(String usuario_cpf) {
        this.usuario_cpf = usuario_cpf;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_telefone() {
        return usuario_telefone;
    }

    public void setUsuario_telefone(String usuario_telefone) {
        this.usuario_telefone = usuario_telefone;
    }

    public String getUsuario_email() {
        return usuario_email;
    }

    public void setUsuario_email(String usuario_email) {
        this.usuario_email = usuario_email;
    }

    public String getUsuario_senha() {
        return usuario_senha;
    }

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }

    public long getUsuario_endereco() {
        return usuario_endereco;
    }

    public void setUsuario_endereco(long usuario_endereco) {
        this.usuario_endereco = usuario_endereco;
    }

    public char getUsuario_tipo() {
        return usuario_tipo;
    }

    public void setUsuario_tipo(char usuario_tipo) {
        this.usuario_tipo = usuario_tipo;
    }
    
    @ManyToOne
    @JoinColumn(name = "usuario_endereco")
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @OneToOne(mappedBy = "entregador")
    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }
    
    @OneToOne(mappedBy = "gerente")
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }   
}
