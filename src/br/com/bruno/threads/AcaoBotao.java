package br.com.bruno.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class AcaoBotao implements ActionListener {

    // Atributos
    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    // Construtor
    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());
        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(BigInteger.ONE);
            }
        }
        resultado.setText(calculo.toString());
    }


}
