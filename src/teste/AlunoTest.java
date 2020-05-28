package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.newtonpaiva.Conexao;
import classes.Aluno;
import classes.Pessoa;

class AlunoTest {

	@Test
    public void InserirAlunoSucesso(){
	
	String nome = "Aluno 1";
	String endereco = "Rua tal 123";
	String telefone = "00 9999-9999";
	
	String matricula = "1";
	String situacao = "Pendente";
	
			
	Pessoa p = new Pessoa(nome, endereco, telefone);
	
	assertEquals("Aluno 1", p.getNome());
	assertEquals("Rua tal 123", p.getEndereco());
	assertEquals("00 9999-9999", p.getTelefone());
	
	Aluno a = new Aluno(p, matricula, situacao);
	assertEquals("1", a.getMatricula());
	assertEquals("Pendente", a.getSituacao());
	
//        assertEquals(calc.somar(2,2), 4);
       
    }
	@Test
    public void InserirAlunoFalha(){
	
	String nome = "Aluno 2";
	String endereco = "Rua aquela 456";
	String telefone = "00 1111-1111";
	
	String matricula = "2";
	String situacao = "Ativo";
	
			
	Pessoa p = new Pessoa(nome, endereco, telefone);
	
	assertNotEquals("Aluno 1", p.getNome());
	assertNotEquals("Rua tal 123", p.getEndereco());
	assertNotEquals("00 9999-9999", p.getTelefone());
	
	Aluno a = new Aluno(p, matricula, situacao);
	assertNotEquals("1", a.getMatricula());
	assertNotEquals("Pendente", a.getSituacao());
	
	
//        assertEquals(calc.somar(2,2), 4);
       
    }
	@Test
    public void TestaConexao(){
		Conexao conn = new Conexao();
		
		conn.getConexaoMySQL();
		assertEquals("Sucesso!", conn.statusConection());
    }
}
