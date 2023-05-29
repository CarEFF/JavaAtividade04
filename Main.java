/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Carlos", "987.654.321-32", "987.654.321-98", 1000, 
                LocalDate.of(2023, Month.JUNE, 17), Genero.MASCULINO, Setor.OPERACOES);
        
        Motoboy motoboy = new Motoboy("ABC-98765", "Carlos", "321.654.978-98", "654.321.987-65", 1000, 
                LocalDate.of(2023, Month.JUNE, 17), Genero.MASCULINO, Setor.OPERACOES);
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Carlos", "987.654.321-32", "987-654-321-98", 1000, LocalDate.of(2023, Month.JUNE, 17), 
                Genero.FEMININO, Setor.OPERACOES);
        
        System.out.println(motoboy.toString());
        System.out.println("-----------------");
        System.out.println(gerente.toString());
        System.out.println("-----------------");
        System.out.println(diretor.toString());
        
    }
}
