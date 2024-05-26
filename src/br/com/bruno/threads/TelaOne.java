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

        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(new Label("x"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);
        painel.add(botaoLimpar); // Adicionado aqui para manter a orientação

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
    }
}
