package Telas;

import javax.swing.JOptionPane;

public class TelaConverteEMostraResultadoMoeda extends Conversor {

    public TelaConverteEMostraResultadoMoeda(double valor, String op) {
        converter(valor, op);

        String msg = String.format("O valor convertido foi %s %.2f", super.simboloConversao, super.valorConvertido);

        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {

        switch (op) {
            case "De Reais a Dólares" -> {
                super.simboloConversao = "U$";
                super.valorConvertido = valor /  5.20;
            }
            case "De Reais a Euros" -> {
                super.simboloConversao = "€";
                super.valorConvertido = valor / 5.06;
            }
            case "De Reais a Libras Esterlinas" -> {
                super.simboloConversao = "£";
                super.valorConvertido = valor / 5.77;
            }
            case "De Reais a Peso Argentino" -> {
                super.simboloConversao = "$";
                super.valorConvertido = valor / 0.035;
            }
            case "De Reais a Peso Chileno" -> {
                super.simboloConversao = "CLP";
                super.valorConvertido = valor / 0.0056;
            }
            case "De Dólares a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.19;
            }
            case "De Euros a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.11;
            }
            case "De Libras Esterlinas a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.7752;
            }
            case "De Peso Argentino a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.035;
            }
            case "De Peso Chileno a Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.0056;
            }
        }
    }
}