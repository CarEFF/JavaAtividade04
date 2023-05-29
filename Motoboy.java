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
public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, double salarioBase, LocalDate dataAdmissao, Genero genero, Setor setor) {
        super(nome, cpf, rg, salarioBase, dataAdmissao, genero, setor);
        this.placaDaMoto = placaDaMoto;
    }    
    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n PLACA DA MOTO:" + placaDaMoto;
    }
    
    
    
}
