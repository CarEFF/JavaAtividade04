/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS("Recursos"),
    ADMINISTRACAO("Administração"),
    OPERACOES("Operações");
    
    public String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
