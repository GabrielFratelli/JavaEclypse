package javaswing;

import javax.swing.*;
import java.awt.event.*;

public class Exemplo03 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Exemplo de Campo de Senha");
		final JLabel label = new JLabel();
		label.setBounds(20, 150, 200, 150);
		final JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		JLabel l1 = new JLabel("Usu�rio:");
		l1.setBounds(20, 20, 80, 30);
		JLabel l2 = new JLabel("Senha:");
		l2.setBounds(20, 75, 80, 30);
		JButton b = new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		final JTextField text = new JTextField();
		text.setBounds(100, 20, 100, 30);
		f.add(value);
		f.add(l1);
		f.add(label);
		f.add(l2);
		f.add(b);
		f.add(text);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Usu�rio " + text.getText();
				data += ", Senha: " + new String(value.getPassword());
				label.setText(data);
			}
		});
	}
}