package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Turma;

public class TurmaTest {

	@Test
	public void InserirTurmaSucesso() {
		
		String Nome = "Sistema Informação 01";
		int Ano = 2020;
		String Semestre = "01";
		
		Turma t = new Turma(Nome, Ano, Semestre);
		
		assertEquals("Sistema Informação 01", t.getNome());
		assertEquals(2020, t.getAno());
		assertEquals("01", t.getSemestre());
	}

	
	@Test
	public void InserirTurmaFalha() {
		
		String Nome = "Veterinaria 01";
		int Ano = 2018;
		String Semestre = "06";
		
		Turma t = new Turma(Nome, Ano, Semestre);
		
		assertNotEquals("Sistema Informação 01", t.getNome());
		assertNotEquals(2020, t.getAno());
		assertNotEquals("01", t.getSemestre());
	}

}
