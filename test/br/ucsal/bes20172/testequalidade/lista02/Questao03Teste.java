package br.ucsal.bes20172.testequalidade.lista02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import br.ucsal.bes20172.testequalidade.lista02.Questao03;

@RunWith(MockitoJUnitRunner.class)
public class Questao03Teste {

	@Mock
	QuestoesHelper questoesHelper;	
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void obterNumeroExibirSePrimo() {
		Questao03 questao03 = new Questao03(questoesHelper);		
		int num = 1;
		boolean situacaoPrimo = false;
		
		Mockito.when(questoesHelper.obterNumeroQuestao3()).thenReturn(num);
		Mockito.when(questoesHelper.verificarNumeroPrimoQuestao3(num)).thenReturn(situacaoPrimo);
		Mockito.doNothing().when(questoesHelper).exibirResultadoQuestao3(num, situacaoPrimo);
		
		//Anotação para Dúvida
		questao03.obterNumeroExibirSePrimo();
		assertFalse(situacaoPrimo);
	}
}
