package view;

import controller.Ex1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex1 m = new Ex1();
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int quantidade = 0;
        int resp = m.freccontadigito(num, quantidade);
        System.out.println("A quantidade de dígitos é: " + resp);

    }
}