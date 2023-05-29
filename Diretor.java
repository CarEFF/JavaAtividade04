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
public class Diretor extends CargoDeConfiança{
    private final double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, double salarioBase, LocalDate dataAdmissao, Genero genero, Setor setor) {
        super(bonificacao, nome, cpf, rg, salarioBase, dataAdmissao, genero, setor);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        //return super.salarioBase + ((super.salarioBase * PREMIO) + super.salarioBase * bonificacao.GERENTE.getValor());
        
       double salarioFinal = 0;
       salarioFinal += salarioBase;
       salarioFinal += salarioBase * bonificacao.getValor();
       salarioFinal += salarioBase * PREMIO;
       return salarioFinal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n SALARIO FINAL DIRETOR:" + getSalarioFinal();
    }
    
    
    
}
