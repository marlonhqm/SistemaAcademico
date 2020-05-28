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
public class Disciplina {
    
    private int Id;
    private String Nome;
    private String Descricao;
    private double CargaHoraria;
    private String Ementa;
    private String Bibliografia;
    private List<Disciplina> PreRequisitos;
    private List<Professor> Professores;

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

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public double getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(double CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public String getEmenta() {
        return Ementa;
    }

    public void setEmenta(String Ementa) {
        this.Ementa = Ementa;
    }

    public String getBibliografia() {
        return Bibliografia;
    }

    public void setBibliografia(String Bibliografia) {
        this.Bibliografia = Bibliografia;
    }

    public List<Disciplina> getPreRequisitos() {
        return PreRequisitos;
    }

    public void setPreRequisitos(List<Disciplina> PreRequisitos) {
        this.PreRequisitos = PreRequisitos;
    }
    
    public List<Professor> getProfessores() {
        return Professores;
    }

    public void setProfessores(List<Professor> Professores) {
        this.Professores = Professores;
    }

    public Disciplina() {
    }
    
    public void CadastrarDisciplina()
    {
        
    }

}
