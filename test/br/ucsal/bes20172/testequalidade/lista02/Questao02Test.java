package br.ucsal.bes20172.testequalidade.lista02;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Questao02Test {

	@Mock
	QuestoesHelper questoesHelper;

	@Before
	public void setUp() {
		
		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void obterNumerosExibirInformadoEInvertido() {
		Questao02 questao02 = new Questao02(questoesHelper);
		
		int[] vet = { 1, 2, 3, 4, 5 };
		int[] vetInvertida = {};
		int[] vetAtual = {5,4,3,2,1};
		
	
		Mockito.doNothing().when(questoesHelper).obterNumeros(vet);
		
		Mockito.doNothing().when(questoesHelper).inverterOrdemNumeros(vet, vetInvertida);
		
		Mockito.doNothing().when(questoesHelper).exibirVetores(vet, vetAtual);
		
		questao02.obterNumerosExibirInformadoEInvertido();
		
		// Assert pelo Teste Unitário
		int[] vetEsperado = {5,4,3,2,1};
		Assert.assertArrayEquals(vetEsperado, vetAtual);
	}

}
