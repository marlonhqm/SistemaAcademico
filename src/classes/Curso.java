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
public class Curso {
    private int Id;
    private String Nome;
    private List<Turma> Turmas;
    
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

    public List<Turma> getTurmas() {
        return Turmas;
    }

    public void setTurmas(List<Turma> Turmas) {
        this.Turmas = Turmas;
    }
    
    public Curso() {
    }
    
    public void CadastrarCurso()
    {
        
    }

}
