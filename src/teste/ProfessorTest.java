package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.*;

class ProfessorTest {
	
	@Test
	public void TestaCriarProfessor() throws Exception {
		Professor p = new Professor("Teste Nome","Teste Endereco","Teste Telefone","123",false);
		assertEquals("Teste Nome", p.getPessoa().getNome());
		assertEquals("Teste Endereco", p.getPessoa().getEndereco());
		assertEquals("Teste Telefone", p.getPessoa().getTelefone());
		assertEquals("123", p.getTitulacao());
		assertEquals(false, p.isCoordenador());
	}
	
	@Test
	public void TestaCriarProfessorFalha() throws Exception {
		Professor p = new Professor("Teste Nome","Teste Endereco","Teste Telefone","123",false);
		assertNotEquals("Teste Nome Incorreto", p.getPessoa().getNome());
		assertNotEquals("Teste Endereco Incorreto", p.getPessoa().getEndereco());
		assertNotEquals("Teste Telefone Incorreto", p.getPessoa().getTelefone());
		assertNotEquals("123 Incorreto", p.getTitulacao());
		assertNotEquals(true, p.isCoordenador());
	}
	@Test
	public void TestaMudarCargo() throws Exception {
		Professor p = new Professor("Teste Nome","Teste Endereco","Teste Telefone","123",false);
		p.setCoordenador(true);
		assertEquals(true, p.isCoordenador());
	}

}
