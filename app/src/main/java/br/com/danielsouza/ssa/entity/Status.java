package br.com.danielsouza.ssa.entity;

import java.io.Serializable;

/**
 * Created by daniel.souza on 27/01/2016.
 */
public class Status implements Serializable{

    private Integer id;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
