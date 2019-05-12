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
@Named(value = "tb_endereco")
public class Endereco implements Serializable {
    private long endereco_id;
    private String endereco_rua;
    private int endereco_numero;
    private String endereco_complemento;
    private String endereco_bairro;
    private long endereco_cidade;
    private Cidade cidade = new Cidade();
    
    public Endereco() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(long endereco_id) {
        this.endereco_id = endereco_id;
    }

    public String getEndereco_rua() {
        return endereco_rua;
    }

    public void setEndereco_rua(String endereco_rua) {
        this.endereco_rua = endereco_rua;
    }

    public int getEndereco_numero() {
        return endereco_numero;
    }

    public void setEndereco_numero(int endereco_numero) {
        this.endereco_numero = endereco_numero;
    }

    public String getEndereco_complemento() {
        return endereco_complemento;
    }

    public void setEndereco_complemento(String endereco_complemento) {
        this.endereco_complemento = endereco_complemento;
    }

    public String getEndereco_bairro() {
        return endereco_bairro;
    }

    public void setEndereco_bairro(String endereco_bairro) {
        this.endereco_bairro = endereco_bairro;
    }

    public long getEndereco_cidade() {
        return endereco_cidade;
    }

    public void setEndereco_cidade(long endereco_cidade) {
        this.endereco_cidade = endereco_cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
