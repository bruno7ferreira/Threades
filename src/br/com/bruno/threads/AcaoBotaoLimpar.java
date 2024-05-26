package br.com.bruno.threads;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotaoLimpar implements ActionListener {

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    // Construtor
    public AcaoBotaoLimpar(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        primeiro.setText("");
        segundo.setText("");
        resultado.setText(" ?");
    }
}
