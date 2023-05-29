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
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected double salarioBase;
    protected LocalDate dataAdmissao;
    protected Genero genero;
    protected Setor setor;

    public Funcionario(String nome, String cpf, String rg, double salarioBase, LocalDate dataAdmissao, Genero genero, Setor setor) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
        this.genero = genero;
        this.setor = setor;
    }

    public abstract double getSalarioFinal();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "NOME:" + nome 
                + "\n CPF:" + cpf 
                + "\n RG:" + rg 
                + "\n SALARIO BASE:" + salarioBase 
                + "\n DATA ADMISSÃO" + dataAdmissao 
                + "\n GENERO:" + genero 
                + "\n SETOR:" + setor;
    }
    
    
    
}
