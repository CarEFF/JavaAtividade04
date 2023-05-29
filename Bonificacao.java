/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);
    
    private double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    
    
}
