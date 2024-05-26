package br.com.bruno.threads;

import javax.swing.*;
import java.awt.*;

public class TelaOne {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Multiplicação!");
        JTextField primeiro = new JTextField(10);
        JTextField segundo = new JTextField(10);
        JButton botao = new JButton(" = ");
        JLabel resultado = new JLabel(" ?");
        JButton botaoLimpar = new JButton("Limpar");

        botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado));
        botaoLimpar.addActionListener(new AcaoBotaoLimpar(primeiro, segundo, resultado));

        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        // Adicionando o primeiro campo de texto
        c.gridx = 0;
        c.gridy = 0;
        painel.add(primeiro, c);

        // Adicionando o label "x"
        c.gridx = 1;
        painel.add(new Label("x"), c);

        // Adicionando o segundo campo de texto
        c.gridx = 2;
        painel.add(segundo, c);

        // Adicionando o botão "="
        c.gridx = 3;
        painel.add(botao, c);

        // Adicionando o label de resultado
        c.gridx = 4;
        painel.add(resultado, c);

        // Adicionando o botão "Limpar" na linha seguinte
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 5;
        c.anchor = GridBagConstraints.CENTER;
        painel.add(botaoLimpar, c);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
