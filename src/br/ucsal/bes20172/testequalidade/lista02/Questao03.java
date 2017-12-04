package br.ucsal.bes20172.testequalidade.lista02;

public class Questao03 {
	
	QuestoesHelper questoesHelper;
	
	public Questao03(QuestoesHelper questoesHelper) {
		this.questoesHelper = questoesHelper;
	}
	
	public static void main(String[] args) {
		QuestoesHelper questoesHelper = new QuestoesHelper();
		Questao03 questao03 = new Questao03(questoesHelper);
		questao03.obterNumeroExibirSePrimo();
	}
	
	public void obterNumeroExibirSePrimo() {
		int num = questoesHelper.obterNumeroQuestao3();
		boolean situacaoPrimo = questoesHelper.verificarNumeroPrimoQuestao3(num);
		questoesHelper.exibirResultadoQuestao3(num, situacaoPrimo);
	}
}