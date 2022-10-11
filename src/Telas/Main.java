package Telas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Objects;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;

public class Main {

	public static void main(String[] args) {
		
		UIManager.put("OptionPane.minimumSize", new Dimension(380, 150));
		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Times New Roman", Font.BOLD, 18)));
		UIManager.put("OptionPane.font", new FontUIResource(new Font("Times New Roman", Font.BOLD, 18)));
		UIManager.put("TextField.font", new FontUIResource(new Font("Times New Roman", Font.BOLD, 18)));
		UIManager.put("OptionPane.background", Color.LIGHT_GRAY); // Moldura
		UIManager.put("Panel.background", Color.pink);
		
		do {
			try {
				TelaEscolheConversor telaEscolhaConversor = new TelaEscolheConversor();
				
				TelaEntradaValor telaEscolhaValor = new TelaEntradaValor();
				
				double valorSelecionado = telaEscolhaValor.getValor();
				
				if (Objects.equals(telaEscolhaConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
					TelaSelecionaMoedas telaEscolhaMoedas = new TelaSelecionaMoedas();
					new TelaConverteEMostraResultadoMoeda(valorSelecionado, telaEscolhaMoedas.getOpcaoSelecionada());

				} else {
					TelaSelecionaTemperaturas telaEscolhaTemperaturas = new TelaSelecionaTemperaturas();
					new TelaConverteEMostraResultadoTemperatura(valorSelecionado,
							telaEscolhaTemperaturas.getOpcaoSelecionada());
				}
				
			} catch (NumberFormatException exception) {
				new TelaMostraMensagemErro("Valor informado é inválido!");
			} catch (Exception exception) {
				new TelaMostraMensagemErro("Ocorreu um problema...");
			}
		} while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

		JOptionPane.showMessageDialog(null, "Programa finalizado!");

		System.exit(0);
	}
}
