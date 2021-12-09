package com.developper.tutorialrestapi.model;

import javax.persistence.*;

@Entity(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    @Column(nullable = false, length =  50)
    private String name;
    @Column(nullable = false, length = 10)
    private String login;
    @Column(nullable = false, length = 10)
    private String senha;


    public UsuarioModel(Integer codigo, String name, String login, String senha) {
        this.codigo = codigo;
        this.name = name;
        this.login = login;
        this.senha = senha;
    }

    public UsuarioModel() {

    }


    public Integer getCodigo(){
        return codigo;
    }
    public String getName(){
        return name;
    }
    public String getLogin(){
        return login;
    }
    public String getSenha(){
        return senha;
    }
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
