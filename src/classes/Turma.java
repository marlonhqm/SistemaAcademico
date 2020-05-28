/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;



/**
 *
 * @author 11613016
 */
public class Turma {
    private int Id;
    private String Nome;
    private int Ano;
    private String Semestre;
    private List<Aluno> Alunos;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<Aluno> Alunos) {
        this.Alunos = Alunos;
    }

    public Turma(String Nome, int Ano, String Semestre) {
    	this.setNome(Nome);
    	this.setAno(Ano);
    	this.setSemestre(Semestre);
    }
    
    public void CadastrarTurma()
    {
        
    }
    
    public void ConsultarTurma()
    {
        
    }
    
    
}
