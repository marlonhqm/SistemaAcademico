/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 11613016
 */
public class Aluno extends Pessoa {
    private Pessoa pessoa;
    private String Matricula;
    private String Situacao;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    public Aluno() {
    }
    
    public Aluno(Pessoa pessoa, String matricula, String situacao) {
    	setPessoa(pessoa);
    	setMatricula(matricula);
    	setSituacao(situacao);   	
    	
    }
    
    public void CadastrarAluno()
    {
        
    }
    
    public Aluno ConsultarAluno(int Id)
    {
        Aluno aluno = new Aluno();   
        return aluno;
    }
    
    public void EmiteHistorico()
    {
        
    }
    
}
