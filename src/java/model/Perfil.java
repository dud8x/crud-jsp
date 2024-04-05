/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 05274565190
 */
public class Perfil {
    
    private int idPerfil;
    private String nome;
    private String opcoes;

    public Perfil() {
    }

    public Perfil(int idPerfil, String nome, String opcoes) {
        this.idPerfil = idPerfil;
        this.nome = nome;
        this.opcoes = opcoes;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String opcoes) {
        this.opcoes = opcoes;
    }
   
    
    
    
}
