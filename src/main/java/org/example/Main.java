package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Entrada: "));

        StringBuilder valoresFor = new StringBuilder();

        for (int i = 0; i < valorEntrada; i++) {
            valoresFor.append("for: ").append(i).append("\n");
        }

        JOptionPane.showMessageDialog(null, valoresFor, "For", JOptionPane.INFORMATION_MESSAGE);

        StringBuilder valoresWhile = new StringBuilder();
        int valorInicialWhile = 0;

        while (valorInicialWhile < valorEntrada) {
            valoresWhile.append("while: ").append(valorInicialWhile).append("\n");
            valorInicialWhile += 1;
        }

        JOptionPane.showMessageDialog(null, valoresWhile, "While", JOptionPane.INFORMATION_MESSAGE);

        StringBuilder valoresDoWhile = new StringBuilder();
        int valorInicialDoWhile = 0;

        do {
            valoresDoWhile.append("do-while: ").append(valorInicialDoWhile).append("\n");
            valorInicialDoWhile += 1;

        } while (valorInicialDoWhile < valorEntrada);

        JOptionPane.showMessageDialog(null, valoresDoWhile, "Do-While", JOptionPane.INFORMATION_MESSAGE);
    }
}