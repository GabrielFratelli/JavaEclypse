package javaswing;

import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.*; // fazendo isso seleciona toda a pasta.

public class Exemplo01Santos {

	public static void main(String[] args) {

		JFrame f = new JFrame("Exibição de um botão");
		JButton b = new JButton("Clique aqui");
		b.setBounds(50, 100, 120, 60);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);

	}
}
