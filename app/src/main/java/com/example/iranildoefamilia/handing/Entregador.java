package com.example.iranildoefamilia.handing;

import java.io.Serializable;

public class Entregador implements Serializable {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String login;
    private String senha;
    public static String IDENT = "Entregador";

    public Entregador(String name,String sobrenome,String telefone,String login,String senha){
        this.nome = name;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
