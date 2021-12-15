package javaswing;

import javax.swing.*;

public class Exemplo01 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Exemplo de Botão");
		JButton b = new JButton("Clique aqui");
		b.setBounds(50, 100, 120, 60);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
}