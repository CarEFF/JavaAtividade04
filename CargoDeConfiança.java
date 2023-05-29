/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfiança extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfiança(Bonificacao bonificacao, String nome, String cpf, String rg, double salarioBase, LocalDate dataAdmissao, Genero genero, Setor setor) {
        super(nome, cpf, rg, salarioBase, dataAdmissao, genero, setor);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
    
}
