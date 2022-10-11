package Telas;

import javax.swing.JOptionPane;

public class TelaEscolheConversor {

	private final String[] opcoes = { "Conversor de moedas", "Conversor de temperatura" };
	private final int opcaoSelecionada;

	public TelaEscolheConversor() {
		opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione o conversor:", "Conversores",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
	}

	public String getOpcaoSelecionada() {
		return this.opcoes[this.opcaoSelecionada];
	}
}
