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
public class Gerente extends CargoDeConfiança{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, double salarioBase, LocalDate dataAdmissao, Genero genero, Setor setor) {
        super(bonificacao, nome, cpf, rg, salarioBase, dataAdmissao, genero, setor);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        //return super.salarioBase + (super.salarioBase * bonificacao.GERENTE.getValor());
        salarioBase += salarioBase * bonificacao.getValor();
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n SALARIO FINAL GERENTE:" + getSalarioFinal();
    }

    
    
    
}
