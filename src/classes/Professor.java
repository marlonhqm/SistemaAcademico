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
public class Professor extends Pessoa {
    
    private Pessoa pessoa;
    private String Titulacao;
    private boolean Coordenador;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String Titulacao) {
        this.Titulacao = Titulacao;
    }

    public boolean isCoordenador() {
        return Coordenador;
    }

    public void setCoordenador(boolean Coordenador) {
        this.Coordenador = Coordenador;
    }

    public Professor() {
    }
    
    public Professor(String Nome, String Endereco, String Telefone, String Titulacao, boolean Coordenador) { 	
        this.pessoa = new Pessoa(Nome,Endereco,Telefone);
        this.Titulacao = Titulacao;
        this.Coordenador = Coordenador;
	}

	public void CadastrarProfessor()
    {
        
    }
    
    public Professor ConsultaProfessor(int Id)
    {
        Professor professor = new Professor();
        return professor;
    }
    
}
