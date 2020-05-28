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
public class Pessoa {
    private int Id;
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public Pessoa() {
        
    }
    
    public Pessoa(String Nome, String Endereco, String Telefone) {
        setNome(Nome);
        setEndereco(Endereco);
        setTelefone(Telefone);
    }
    
    public void CadastrarPessoa()
    {
        
    }
    
    public Pessoa ConsultarPessoa(int Id)
    {
        Pessoa p = new Pessoa();
        
        return p;
    }

    
    
}
