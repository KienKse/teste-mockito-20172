package br.ucsal.bes20172.testequalidade.lista02;

public class Questao02 {

	private static final int QTD_NUM = 5;

	public QuestoesHelper questoesHelper;

	public Questao02(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}
	
	public static void main(String[] args) {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		Questao02 questao02 = new Questao02(questoesHelper);
		questao02.obterNumerosExibirInformadoEInvertido();
	}

	public void obterNumerosExibirInformadoEInvertido() {
		int[] vet = new int[QTD_NUM];
		int[] vetInvertido = new int [QTD_NUM];
		
		// Utilizar Helper nos metodos
		questoesHelper.obterNumeros(vet);
		questoesHelper.inverterOrdemNumeros(vet, vetInvertido);
		questoesHelper.exibirVetores(vet, vetInvertido);
	}

	
}
